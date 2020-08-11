package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

public class MoveLogic {
    private int rowWinPosition;
    private int columnWinPosition;
    private final int FREE_CELL = -1;

    public boolean isWin(int[][] field, Player player) {
        for (int row = 0; row < field.length; row++) {
            if (isTwoInRow(field[row][0], field[row][1], field[row][2]) &&
                    isPlayerWinCombination(field[row][0], field[row][1], field[row][2], player.getPlayerFigure())
                    && (findWinRowAndColumn(field, row, true))) {
                return true;
            }
        }
        for (int column = 0; column < field[0].length; column++) {
            if (isTwoInRow(field[0][column], field[1][column], field[2][column]) &&
                    isPlayerWinCombination(field[0][column], field[1][column], field[2][column], player.getPlayerFigure())
                    && findWinRowAndColumn(field, column, false)) {
                return true;
            }
        }
        if (isTwoInRow(field[0][0], field[1][1], field[2][2])) {
            return findWinDiagonals(field, true);
        }

        if (isTwoInRow(field[0][2], field[1][1], field[2][0])) {
            return findWinDiagonals(field, false);
        }
        return false;
    }

    public void setRowWinPosition(int rowWinPosition) {
        this.rowWinPosition = rowWinPosition;
    }

    public void setColumnWinPosition(int columnWinPosition) {
        this.columnWinPosition = columnWinPosition;
    }

    public int getRowWinPosition() {
        return rowWinPosition;
    }

    public int getColumnWinPosition() {
        return columnWinPosition;
    }

    private boolean isTwoInRow(int firstValue, int secondValue, int thirdValue) {
        if (firstValue == FREE_CELL && secondValue == FREE_CELL && thirdValue == FREE_CELL) return false;
        if (!isEmptyCell(firstValue, secondValue, thirdValue)) return false;
        return firstValue == secondValue || secondValue == thirdValue || firstValue == thirdValue;
    }

    private boolean isEmptyCell(int firstValue, int secondValue, int thirdValue) {
        if (firstValue == secondValue) {
            if (firstValue == FREE_CELL) return false;
        }
        if (secondValue == thirdValue) {
            if (secondValue == FREE_CELL) return false;
        }
        if (firstValue == thirdValue) {
            return firstValue != FREE_CELL;
        }
        return true;
    }

    private boolean isPlayerWinCombination(int firstValue, int secondValue, int thirdValue, int playerToCheck) {
        return firstValue == playerToCheck || secondValue == playerToCheck || thirdValue == playerToCheck;
    }

    private boolean findWinRowAndColumn(int[][] field, int position, boolean isRow) {
        for (int count = 0; count < 3; count++) {
            if (isRow) {
                if (field[position][count] == FREE_CELL) {
                    setRowWinPosition(position);
                    setColumnWinPosition(count);
                    return true;
                }
            } else {
                if (field[count][position] == FREE_CELL) {
                    setRowWinPosition(count);
                    setColumnWinPosition(position);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findWinDiagonals(int[][] field, boolean isLeftToRight) {
        if (isLeftToRight) {
            for (int count = 0; count < 3; count++) {
                if (field[count][count] == FREE_CELL) {
                    setRowWinPosition(count);
                    setColumnWinPosition(count);
                    return true;
                }
            }
        } else {
            int shift = 0;
            for (int count = 2; count >= 0; count--) {
                if (field[shift][count] == FREE_CELL) {
                    setRowWinPosition(shift);
                    setColumnWinPosition(count);
                    return true;
                }
                shift++;
            }
        }
        return false;
    }
}
