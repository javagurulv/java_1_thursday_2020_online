package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_20;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isisWinPositionForVerticalsTest1();
        test.isisWinPositionForVerticalsTest2();
        test.isisWinPositionForVerticalsTest3();
        test.isisWinPositionForVerticalsTest4();
    }

    public void isisWinPositionForVerticalsTest1() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[1][0] = 0;
        field[2][0] = 0;
        boolean result = game.isisWinPositionForVerticals(field, 0);

        if (result == true) {
            System.out.println("isisWinPositionForVerticalsTest1 - OK");
        } else {
            System.out.println("isisWinPositionForVerticalsTest1 - FAIL");
        }
    }

    public void isisWinPositionForVerticalsTest2() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][1] = 0;
        field[1][1] = 0;
        field[2][1] = 0;
        boolean result = game.isisWinPositionForVerticals(field, 0);

        if (result == true) {
            System.out.println("isisWinPositionForVerticalsTest2 - OK");
        } else {
            System.out.println("isisWinPositionForVerticalsTest2 - FAIL");
        }
    }

    public void isisWinPositionForVerticalsTest3() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][2] = 0;
        field[1][2] = 0;
        field[2][2] = 0;
        boolean result = game.isisWinPositionForVerticals(field, 0);

        if (result == true) {
            System.out.println("isisWinPositionForVerticalsTest3 - OK");
        } else {
            System.out.println("isisWinPositionForVerticalsTest3 - FAIL");
        }
    }

    public void isisWinPositionForVerticalsTest4() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][2] = 1;
        field[1][2] = 1;
        field[2][2] = 1;
        boolean result = game.isisWinPositionForVerticals(field, 1);

        if (result == true) {
            System.out.println("isisWinPositionForVerticalsTest4 - OK");
        } else {
            System.out.println("isisWinPositionForVerticalsTest4 - FAIL");
        }
    }

}
