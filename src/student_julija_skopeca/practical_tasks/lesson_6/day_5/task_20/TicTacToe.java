package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_20;

class TicTacToe {

    public boolean isisWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) &&
                    (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }
}
