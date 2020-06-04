package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionTest1();
        test.isWinPositionTest2();
        test.isWinPositionTest3();
        test.isWinPositionTest4();
    }

    public void isWinPositionTest1() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[1][1] = 0;
        field[2][2] = 0;
        boolean result = game.isWinPosition(field, 0);

        if (result == true) {
            System.out.println("isWinPositionTest1 - OK");
        } else {
            System.out.println("isWinPositionTest1 - FAIL");
        }
    }

    public void isWinPositionTest2() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[0][1] = 1;
        field[0][2] = 1;
        boolean result = game.isWinPosition(field, 1);

        if (result == true) {
            System.out.println("isWinPositionTest2 - OK");
        } else {
            System.out.println("isWinPositionTest2 - FAIL");
        }
    }

    public void isWinPositionTest3() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[1][0] = 1;
        field[2][0] = 1;
        boolean result = game.isWinPosition(field, 1);

        if (result == true) {
            System.out.println("isWinPositionTest3 - OK");
        } else {
            System.out.println("isWinPositionTest3 - FAIL");
        }
    }

    public void isWinPositionTest4() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[1][0] = 1;
        field[2][0] = 1;
        boolean result = game.isWinPosition(field, 1);

        if (result == false) {
            System.out.println("isWinPositionTest4 - OK");
        } else {
            System.out.println("isWinPositionTest4 - FAIL");
        }
    }


}
