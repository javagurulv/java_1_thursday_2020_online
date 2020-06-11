package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isDrawPositionTest1();
        test.isDrawPositionTest2();
        test.isDrawPositionTest3();
        test.isDrawPositionTest4();
    }

    public void isDrawPositionTest1() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[0][1] = 0;
        field[0][2] = 1;
        field[1][0] = 0;
        field[1][1] = 1;
        field[1][2] = 0;
        field[2][0] = 1;
        field[2][1] = 0;
        field[2][2] = 1;
        boolean result = game.isDrawPosition(field, 0);

        if (result == true) {
            System.out.println("isDrawPositionTest1 - OK");
        } else {
            System.out.println("isDrawPositionTest1 - FAIL");
        }
    }


    public void isDrawPositionTest2() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[0][1] = 0;
        field[0][2] = 0;
        field[1][0] = 1;
        field[1][1] = 0;
        field[1][2] = 0;
        field[2][0] = 0;
        field[2][1] = 1;
        field[2][2] = 1;
        boolean result = game.isDrawPosition(field, 0);

        if (result == false) {
            System.out.println("isDrawPositionTest2 - OK");
        } else {
            System.out.println("isDrawPositionTest2 - FAIL");
        }
    }

    public void isDrawPositionTest3() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[0][1] = 0;
        field[0][2] = 1;
        field[1][0] = 1;
        field[1][1] = 1;
        field[1][2] = 0;
        field[2][0] = 1;
        field[2][1] = 0;
        field[2][2] = 1;
        boolean result = game.isDrawPosition(field, 1);

        if (result == false) {
            System.out.println("isDrawPositionTest3 - OK");
        } else {
            System.out.println("isDrawPositionTest3 - FAIL");
        }
    }

    public void isDrawPositionTest4() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 1;
        field[0][1] = 0;
        field[0][2] = 1;
        field[1][0] = 1;
        field[1][1] = 1;
        field[1][2] = 0;
        field[2][0] = 1;
        field[2][1] = 0;
        field[2][2] = -1;
        boolean result = game.isDrawPosition(field, 1);

        if (result == false) {
            System.out.println("isDrawPositionTest4 - OK");
        } else {
            System.out.println("isDrawPositionTest4 - FAIL");
        }
    }

}
