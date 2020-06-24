package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

public class IsDiagonalHaveWinPosition extends SearcherWinPosition {
    private final List<Integer> rightDiagonal = new ArrayList<>();
    private final List<Integer> leftDiagonal = new ArrayList<>();
    private final List<List<Integer>> rightDiagonalsCoordinate = new ArrayList<>();
    private final List<List<Integer>> leftDiagonalsCoordinate = new ArrayList<>();

    public IsDiagonalHaveWinPosition() {
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(0, 4, 9, 15, 21, 26)));
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(1, 5, 10, 16, 22)));
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(2, 6, 11, 17)));
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(3, 8, 14, 20, 25, 29)));
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(7, 13, 19, 24, 28)));
        rightDiagonalsCoordinate.add(new ArrayList<>(List.of(12, 18, 23, 27)));

        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(0, 3, 7, 12)));
        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(1, 4, 8, 13, 18)));
        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(2, 5, 9, 14, 19, 23)));
        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(6, 10, 15, 20, 24, 27)));
        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(11, 16, 21, 25, 28)));
        leftDiagonalsCoordinate.add(new ArrayList<>(List.of(17, 22, 26, 29)));
    }

    @Override
    public boolean searchWinPosition(List<Column> gameArea, Player player) {
        return searchDiagonals(gameArea, player);
    }

    private boolean searchDiagonals(List<Column> gameArea, Player player) {
        createDiagonals(gameArea, rightDiagonal, DiagonalsDirection.Right);
        createDiagonals(gameArea, leftDiagonal, DiagonalsDirection.Left);

        boolean rightDiagonals = findWinPositionDiagonals(rightDiagonalsCoordinate, rightDiagonal, player);
        boolean leftDiagonals = findWinPositionDiagonals(leftDiagonalsCoordinate, leftDiagonal, player);

        return rightDiagonals || leftDiagonals;
    }

    private boolean findWinPositionDiagonals(List<List<Integer>> diagonalCoordinate, List<Integer> diagonalBoard, Player player) {
        final int START_COUNT_CHIPS = 0;
        final int FOUR_IN_ROW = 4;

        for (List<Integer> index : diagonalCoordinate) {
            int chipsCounter = START_COUNT_CHIPS;
            for (int cellIndex : index) {
                if (diagonalBoard.get(cellIndex) == player.getChip()) {
                    chipsCounter++;
                } else {
                    chipsCounter = START_COUNT_CHIPS;
                }
                if (chipsCounter == FOUR_IN_ROW) {
                    diagonalBoard.clear();
                    return true;
                }
            }
        }
        diagonalBoard.clear();
        return false;
    }

    private void createDiagonals(List<Column> gameArea, List<Integer> diagonal, DiagonalsDirection direction) {
        final int EMPTY_CELL = 0;
        final int CELL_FIVE_IN_COLUMN = 5;
        final int CELL_FOUR_IN_COLUMN = 4;
        final int CELL_THREE_IN_COLUMN = 3;
        final int CELL_TWO_IN_COLUMN = 2;
        final int CELL_ONE_IN_COLUMN = 1;
        final int OFFSET_1 = 1;
        final int OFFSET_2 = 2;
        final int OFFSET_4 = 4;
        final int OFFSET_5 = 5;
        final int OFFSET_6 = 6;

        int columnIndex = 0;

        if (direction == DiagonalsDirection.Left) {
            columnIndex = -6;
        }

        for (Column column : gameArea) {
            for (int i = 5; i >= 0; i--) {
                if (column.getColumnIndex() == Math.abs(columnIndex + OFFSET_4) && i == CELL_FIVE_IN_COLUMN) {
                    continue;
                }
                if (column.getColumnIndex() == Math.abs(columnIndex + OFFSET_5) && ((i == CELL_FIVE_IN_COLUMN) || (i == CELL_FOUR_IN_COLUMN))) {
                    continue;
                }
                if (column.getColumnIndex() == Math.abs(columnIndex + OFFSET_6) && ((i == CELL_FIVE_IN_COLUMN) || ((i == CELL_FOUR_IN_COLUMN) || (i == CELL_THREE_IN_COLUMN)))) {
                    continue;
                }

                try {
                    diagonal.add(column.getChipInColumn(i));
                } catch (IndexOutOfBoundsException e) {
                    diagonal.add(EMPTY_CELL);
                }

                if (column.getColumnIndex() == Math.abs(columnIndex) && i == CELL_THREE_IN_COLUMN) {
                    break;
                }
                if (column.getColumnIndex() == Math.abs(columnIndex + OFFSET_1) && i == CELL_TWO_IN_COLUMN) {
                    break;
                }
                if (column.getColumnIndex() == Math.abs(columnIndex + OFFSET_2) && i == CELL_ONE_IN_COLUMN) {
                    break;
                }
            }
        }
    }
}
