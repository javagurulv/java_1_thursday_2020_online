package student_diana_miranovica.lesson6.home_works.day_5.task_19;

public class TicTacToe {
        //task 19
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        for (int row[] : field){
            if ((row[0] == playerToCheck) && (row[1] == playerToCheck) && (row[2] == playerToCheck)){
             return true;
            }

        }

        return false;
    }

        //task 20
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int column = 0; column < field[0].length; column++) {
            if ((field[0][column] == playerToCheck) && (field[1][column] == playerToCheck) &&
                    (field[2][column] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

        //task 21
        public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){

                if (field[1][1] != playerToCheck) return false;
                if ((field[0][0] == playerToCheck) && (field[2][2] == playerToCheck)) return true;
                return  ((field[0][2] == playerToCheck) && (field[2][0] == playerToCheck)) ;

        }
}
