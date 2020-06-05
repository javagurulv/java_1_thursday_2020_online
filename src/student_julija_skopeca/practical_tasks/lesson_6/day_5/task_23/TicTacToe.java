package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_23;

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

    public boolean isisWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) &&
                    (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[0][0] == playerToCheck) &&
                    (field[1][1] == playerToCheck) &&
                    (field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck) &&
                            (field[1][1] == playerToCheck) &&
                            (field[0][2] == playerToCheck))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck) ||
                isisWinPositionForVerticals(field,playerToCheck) ||
                isWinPositionForDiagonals(field,playerToCheck)) {
            return true;
        } else {
            return false;}
    }


    public boolean isTableFull(int[][] field) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (field[i][j] == -1)
                    return true;
        return false;
    }


    public boolean isDrawPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck) ||
                isisWinPositionForVerticals(field,playerToCheck) ||
                isWinPositionForDiagonals(field,playerToCheck) ||
                isTableFull(field)) {
            return false;
        } else {
            return true;}
    }
}
