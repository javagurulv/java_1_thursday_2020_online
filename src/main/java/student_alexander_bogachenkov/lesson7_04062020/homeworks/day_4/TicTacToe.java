package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_4;

import java.util.Arrays;

class TicTacToe {

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }
        return field;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (isWinPositionForFirstHorizontal(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForSecondHorizontal(field, playerToCheck)) {
            return true;
        } else return isWinPositionForThirdHorizontal(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (isWinPositionForFirstVertical(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForSecondVertical(field, playerToCheck)) {
            return true;
        } else return isWinPositionForThirdVertical(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (isWinPositionForFirstDiagonal(field, playerToCheck)) {
            return true;
        } else return isWinPositionForSecondDiagonal(field, playerToCheck);
    }

    public boolean isWinPositionForFirstHorizontal(int[][] field, int playerToCheck) {
        return  field[0][0] == playerToCheck &&
                field[0][1] == playerToCheck &&
                field[0][2] == playerToCheck;
    }

    public boolean isWinPositionForSecondHorizontal(int[][] field, int playerToCheck) {
        return  field[1][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[1][2] == playerToCheck;
    }

    public boolean isWinPositionForThirdHorizontal(int[][] field, int playerToCheck) {
        return  field[2][0] == playerToCheck &&
                field[2][1] == playerToCheck &&
                field[2][2] == playerToCheck;
    }

    public boolean isWinPositionForFirstVertical(int[][] field, int playerToCheck) {
        return  field[0][0] == playerToCheck &&
                field[1][0] == playerToCheck &&
                field[2][0] == playerToCheck;
    }

    public boolean isWinPositionForSecondVertical(int[][] field, int playerToCheck) {
        return  field[0][1] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][1] == playerToCheck;
    }

    public boolean isWinPositionForThirdVertical(int[][] field, int playerToCheck) {
        return  field[0][2] == playerToCheck &&
                field[1][2] == playerToCheck &&
                field[2][2] == playerToCheck;
    }

    public boolean isWinPositionForFirstDiagonal(int[][] field, int playerToCheck) {
        return  field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck;
    }

    public boolean isWinPositionForSecondDiagonal(int[][] field, int playerToCheck) {
        return  field[0][2] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][0] == playerToCheck;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForFirstPlayer(int[][] field) {
        return isWinPositionForHorizontals(field, 0) ||
                isWinPositionForVerticals(field, 0) ||
                isWinPositionForDiagonals(field, 0);
    }

    public boolean isWinPositionForSecondPlayer(int[][] field) {
        return isWinPositionForHorizontals(field, 1) ||
                isWinPositionForVerticals(field, 1) ||
                isWinPositionForDiagonals(field, 1);
    }

    public boolean hasEmptyCells(int[][] field) {
        int sumEmptyCells = 0;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    sumEmptyCells++;
                }
            }
        }
        return sumEmptyCells > 0;
    }

    public boolean isDrawPosition(int[][] field) {
        return !isWinPositionForFirstPlayer(field) &&
                !isWinPositionForSecondPlayer(field) &&
                !hasEmptyCells(field);
    }
}
