package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_19;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) &&
                    (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }


    public int[][] gameCreation () {
        int[][]field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }
}
