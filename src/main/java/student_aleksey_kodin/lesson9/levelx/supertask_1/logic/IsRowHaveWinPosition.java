package student_aleksey_kodin.lesson9.levelx.supertask_1.logic;

import student_aleksey_kodin.lesson9.levelx.supertask_1.Column;
import student_aleksey_kodin.lesson9.levelx.supertask_1.Player;

import java.util.ArrayList;
import java.util.List;

public class IsRowHaveWinPosition extends SearcherWinPosition {
    @Override
    public boolean searchWinPosition(List<Column> gameArea, Player player) {
        return searchRows(gameArea, player);
    }

    private boolean searchRows(List<Column> gameArea, Player player) {
        final int FIRST_COLUMN = 0;
        final int LAST_COLUMN = 6;
        final int EMPTY_CELL = 0;
        List<Integer> allRows = new ArrayList<>();

        for (int i = FIRST_COLUMN; i < LAST_COLUMN; i++) {
            for (Column column : gameArea) {
                try {
                    allRows.add(column.getChipInColumn(i));
                } catch (IndexOutOfBoundsException e) {
                    allRows.add(EMPTY_CELL);
                }
            }
        }
        return findWinPosition(allRows, player);
    }

    private boolean findWinPosition(List<Integer> allRows, Player player) {
        final int FOUR_IN_ROW = 4;
        final int NEXT_ROW = 7;
        final int START_COUNT_CHIPS = 0;

        for (int i = 0; i < allRows.size() - 1; ) {
            int chipsCounter = START_COUNT_CHIPS;
            for (int j = i; j < i + NEXT_ROW; j++) {
                try {
                    if (allRows.get(j) == player.getChip()) {
                        chipsCounter++;
                    } else {
                        chipsCounter = START_COUNT_CHIPS;
                    }
                    if (chipsCounter == FOUR_IN_ROW) {
                        return true;
                    }
                } catch (IndexOutOfBoundsException ignored) {
                }
            }
            i = i + NEXT_ROW;
        }
        return false;
    }
}

