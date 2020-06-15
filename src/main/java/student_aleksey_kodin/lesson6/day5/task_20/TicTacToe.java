package student_aleksey_kodin.lesson6.day5.task_20;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            if ((row[0] == playerToCheck) && (row[1] == playerToCheck) && (row[2] == playerToCheck)) {
                return true;
            }
        }
    return false;
    }    // оставляйте пустую строку между методами в классе! Это улучшает читабельность кода
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
            for (int column = 0; column < field[0].length; column++) {
                if ((field[0][column] == playerToCheck) && (field[1][column] == playerToCheck) &&
                        (field[2][column] == playerToCheck)) {
                    return true;
                }
            }
    return false;
    }
}
