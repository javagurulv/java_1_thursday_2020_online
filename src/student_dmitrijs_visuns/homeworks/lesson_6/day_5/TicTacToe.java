package student_dmitrijs_visuns.homeworks.lesson_6.day_5;

class TicTacToe {

    public static void main(String[] args) {

    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field [0][0] == playerToCheck &&
            field [0][1] == playerToCheck &&
            field [0][2] == playerToCheck) {
            return true;
        } else if (field [1][0] == playerToCheck &&
                   field [1][1] == playerToCheck &&
                   field [1][2] == playerToCheck) {
            return true;
        } else if (field [2][0] == playerToCheck &&
                   field [2][1] == playerToCheck &&
                   field [2][2] == playerToCheck) {
            return true;
        }
        else return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field [0][0] == playerToCheck &&
            field [1][0] == playerToCheck &&
            field [2][0] == playerToCheck) {
            return true;
        } else if (field [0][1] == playerToCheck &&
                   field [1][1] == playerToCheck &&
                   field [2][1] == playerToCheck) {
            return true;
        } else if (field [0][2] == playerToCheck &&
                   field [1][2] == playerToCheck &&
                   field [2][2] == playerToCheck) {
            return true;
        }
        else return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field [0][0] == playerToCheck &&
            field [1][1] == playerToCheck &&
            field [2][2] == playerToCheck) {
            return true;
        } else if ((field [2][0] == playerToCheck) && (field [1][1] == playerToCheck) && (field [0][2] == playerToCheck)) {
            return true;
        }
        else return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
            isWinPositionForVerticals(field, playerToCheck) ||
            isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else { return false; }
    }




}
