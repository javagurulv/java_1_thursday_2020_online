package student_julija_skopeca.practical_tasks.lesson_6.day_5.task_21;


class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForDiagonalsTest1();
        test.isWinPositionForDiagonalsTest2();
    }

    public void isWinPositionForDiagonalsTest1() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[1][1] = 0;
        field[2][2] = 0;
        boolean result = game.isWinPositionForDiagonals(field, 0);

        if (result == true) {
            System.out.println("isWinPositionForDiagonalsTest1 - OK");
        } else {
            System.out.println("isWinPositionForDiagonalsTest1 - FAIL");
        }
    }

    public void isWinPositionForDiagonalsTest2() {
        TicTacToe game = new TicTacToe();
        int[][] field = new int[3][3];
        field[2][0] = 1;
        field[1][1] = 1;
        field[0][2] = 1;
        boolean result = game.isWinPositionForDiagonals(field, 1);

        if (result == true) {
            System.out.println("isWinPositionForDiagonalsTest2 - OK");
        } else {
            System.out.println("isWinPositionForDiagonalsTest2 - FAIL");
        }
    }

}
