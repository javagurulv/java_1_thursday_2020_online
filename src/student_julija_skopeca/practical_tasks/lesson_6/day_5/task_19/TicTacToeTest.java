package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_19;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTestLine1();
        test.isWinPositionForHorizontalsTestLine2();
        test.isWinPositionForHorizontalsTestLine3();
        test.isWinPositionForHorizontalsTestLine4();
    }

    public void isWinPositionForHorizontalsTestLine1(){
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[0][1] = 1;
        field[0][2] = 1;
        boolean result = game.isWinPositionForHorizontals(field, 1);

        if (result == true) {
            System.out.println("isWinPositionForHorizontalsTest1 - OK");
        } else {
            System.out.println("isWinPositionForHorizontalsTest1 - FAIL");
        }
    }

    public void isWinPositionForHorizontalsTestLine2(){
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[1][0] = 1;
        field[1][1] = 1;
        field[1][2] = 1;
        boolean result = game.isWinPositionForHorizontals(field, 1);

        if (result == true) {
            System.out.println("isWinPositionForHorizontalsTestLine2 - OK");
        } else {
            System.out.println("isWinPositionForHorizontalsTestLine2 - FAIL");
        }
    }

    public void isWinPositionForHorizontalsTestLine3(){
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[2][0] = 1;
        field[2][1] = 1;
        field[2][2] = 1;
        boolean result = game.isWinPositionForHorizontals(field, 1);

        if (result == true) {
            System.out.println("isWinPositionForHorizontalsTestLine3 - OK");
        } else {
            System.out.println("isWinPositionForHorizontalsTestLine3 - FAIL");
        }
    }

    public void isWinPositionForHorizontalsTestLine4(){
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[2][0] = 0;
        field[2][1] = 0;
        field[2][2] = 0;
        boolean result = game.isWinPositionForHorizontals(field, 0);

        if (result == true) {
            System.out.println("isWinPositionForHorizontalsTestLine4 - OK");
        } else {
            System.out.println("isWinPositionForHorizontalsTestLine4 - FAIL");
        }
    }

}
