package student_aleksey_kodin.lesson6.day5.task_23;

class TicTacToe {
    private int rowWinPosition;
    private int columnWinPosition;
    private int winPlayer;

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            if ((row[0] == playerToCheck) && (row[1] == playerToCheck) && (row[2] == playerToCheck)) {
                return true;
            }
        }
    return false;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
            for (int column = 0; column < field[0].length; column++) {
                if ((field[0][column] == playerToCheck) && (field[1][column] == playerToCheck) &&
                        (field[2][column] == playerToCheck)) {
                    return true;
                }
            }
    return false;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[1][1] != playerToCheck) return false;
        if ((field[0][0] == playerToCheck) && (field[2][2] == playerToCheck)) return true;
        return (field[0][2] == playerToCheck) && (field[2][0] == playerToCheck);
    }
    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int row = 0; row < field.length; row++) {
            if (isTwoInRow(field[row][0], field[row][1], field[row][2])) {
                if (findWinRowAndColumn(field, row,true)) {
                    setWinPlayer(playerToCheck);
                    return true;
                }
            }
        }
            for (int column = 0; column < field[0].length; column++) {
                if (isTwoInRow(field[0][column],field[1][column],field[2][column])) {
                    if(findWinRowAndColumn(field,column,false)) {
                        setWinPlayer(playerToCheck);
                        return true;
                    }
                }
            }
        if (isTwoInRow(field[0][0],field[1][1],field[2][2])) {
            if(findWinDiagonals(field,true)) {
                setWinPlayer(playerToCheck);
                return true;
            }
        }
        if (isTwoInRow(field[0][2],field[1][1],field[2][0])) {
            if(findWinDiagonals(field,false)) {
                setWinPlayer(playerToCheck);
                return true;
            }
        }
    return false;
    }
    public boolean isDrawPosition(int[][] field,int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck) && isWinPositionForVerticals(field,playerToCheck) &&
                isWinPositionForDiagonals(field,playerToCheck)) return false;
        return isFreePlace(field);
    }
    public int getRowWinPosition() {
        return rowWinPosition;
    }
    public void setRowWinPosition(int rowWinPosition) {
        this.rowWinPosition = rowWinPosition;
    }
    public int getColumnWinPosition() {
        return columnWinPosition;
    }
    public void setColumnWinPosition(int columnWinPosition) {
        this.columnWinPosition = columnWinPosition;
    }
    public int getWinPlayer() {
        return winPlayer;
    }
    public void setWinPlayer(int winPlayer) {
        this.winPlayer = winPlayer;
    }
    private boolean isTwoInRow(int firstValue, int secondValue, int thirdValue){
        if (firstValue == -1 && secondValue == -1 && thirdValue == -1) return false;
        if (!isEmptyPlace(firstValue,secondValue,thirdValue)) return false;
        return firstValue == secondValue || secondValue == thirdValue || firstValue == thirdValue;
    }
    private boolean findWinRowAndColumn(int[][] field,int position,boolean isRow) {
        for (int count = 0; count < 3; count++) {
            if(isRow) {
                if (field[position][count] == -1) {
                    setRowWinPosition(position);
                    setColumnWinPosition(count);
                    return true;
                }
            } else {
                if (field[count][position] == -1) {
                    setRowWinPosition(count);
                    setColumnWinPosition(position);
                    return true;
                }
            }
        }
    return false;
    }
    private boolean findWinDiagonals(int[][] field,boolean isLeftToRight) {
        if (isLeftToRight) {
            for (int count = 0; count < 3; count++) {
                if (field[count][count] == -1) {
                    setRowWinPosition(count);
                    setColumnWinPosition(count);
                    return true;
                }
            }
        } else {
            int shift = 0;
            for (int count = 2; count >= 0; count--) {
                if (field[shift][count] == -1) {
                    setRowWinPosition(shift);
                    setColumnWinPosition(count);
                    return true;
                }
                shift++;
            }
        }
    return false;
    }
    private boolean isEmptyPlace(int firstValue, int secondValue, int thirdValue) {
        if (firstValue == secondValue) {
            if (firstValue == -1) return false;
        }
        if (secondValue == thirdValue) {
            if (secondValue == -1) return false;
        }
        if (firstValue == thirdValue) {
            return firstValue != -1;
        }
    return true;
    }
    private boolean isFreePlace(int[][] field) {
        for (int[] row : field) {
            for (int column = 0; column < field[0].length; column++) {
                if (row[column] == -1) return true;
            }
        }
    return false;
    }
}
