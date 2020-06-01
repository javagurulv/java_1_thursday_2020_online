package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_5;

class TicTacToe {

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
}
