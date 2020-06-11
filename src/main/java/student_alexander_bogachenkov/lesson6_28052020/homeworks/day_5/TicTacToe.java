package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_5;

class TicTacToe {

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck &&
            field[0][1] == playerToCheck &&
            field[0][2] == playerToCheck) {
            return true;
        } else if (field[1][0] == playerToCheck &&
                   field[1][1] == playerToCheck &&
                   field[1][2] == playerToCheck) {
            return true;
        } else if (field[2][0] == playerToCheck &&
                   field[2][1] == playerToCheck &&
                   field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck &&
            field[1][0] == playerToCheck &&
            field[2][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == playerToCheck &&
                   field[1][1] == playerToCheck &&
                   field[2][1] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck &&
                   field[1][2] == playerToCheck &&
                   field[2][2] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck &&
            field[1][1] == playerToCheck &&
            field[2][2] == playerToCheck) {
            return true;
        } else if (field[0][2] == playerToCheck &&
                   field[1][1] == playerToCheck &&
                   field[2][0] == playerToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
            isWinPositionForVerticals(field, playerToCheck) ||
            isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForFirstPlayer(int[][] field) {
        if (isWinPositionForHorizontals(field, 0) ||
            isWinPositionForVerticals(field, 0) ||
            isWinPositionForDiagonals(field, 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinPositionForSecondPlayer(int[][] field) {
        if (isWinPositionForHorizontals(field, 1) ||
            isWinPositionForVerticals(field, 1) ||
            isWinPositionForDiagonals(field, 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasEmptyCells(int[][] field) {
        int sumEmptyCells = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    sumEmptyCells += 1;
                }
            }
        }
        if (sumEmptyCells > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        if (!isWinPositionForFirstPlayer(field) &&
            !isWinPositionForSecondPlayer(field) &&
            !hasEmptyCells(field)) {
            return true;
        } else {
            return false;
        }
    }
}
