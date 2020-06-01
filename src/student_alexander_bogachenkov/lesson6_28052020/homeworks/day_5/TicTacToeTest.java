package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForFirstHorizontal();
        test.isWinPositionForSecondHorizontal();
        test.isWinPositionForThirdHorizontal();
        test.isWinPositionForFirstVertical();
        test.isWinPositionForSecondVertical();
        test.isWinPositionForThirdVertical();
        test.isWinPositionForFirstDiagonal();
        test.isWinPositionForSecondDiagonal();
    }

    public void isWinPositionForFirstHorizontal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 0;
        field[0][1] = 0;
        field[0][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForFirstHorizontal PASSED");
        } else {
            System.out.println("isWinPositionForFirstHorizontal FAILED");
        }
    }

    public void isWinPositionForSecondHorizontal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[1][0] = 1;
        field[1][1] = 1;
        field[1][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForSecondHorizontal PASSED");
        } else {
            System.out.println("isWinPositionForSecondHorizontal FAILED");
        }
    }

    public void isWinPositionForThirdHorizontal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[2][0] = 0;
        field[2][1] = 0;
        field[2][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForThirdHorizontal PASSED");
        } else {
            System.out.println("isWinPositionForThirdHorizontal FAILED");
        }
    }

    public void isWinPositionForFirstVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 0;
        field[1][0] = 0;
        field[2][0] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForFirstVertical PASSED");
        } else {
            System.out.println("isWinPositionForFirstVertical FAILED");
        }
    }

    public void isWinPositionForSecondVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][1] = 0;
        field[1][1] = 0;
        field[2][1] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForSecondVertical PASSED");
        } else {
            System.out.println("isWinPositionForSecondVertical FAILED");
        }
    }

    public void isWinPositionForThirdVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][2] = 0;
        field[2][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForThirdVertical PASSED");
        } else {
            System.out.println("isWinPositionForThirdVertical FAILED");
        }
    }

    public void isWinPositionForFirstDiagonal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 0;
        field[1][1] = 0;
        field[2][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForFirstDiagonal PASSED");
        } else {
            System.out.println("isWinPositionForFirstDiagonal FAILED");
        }
    }

    public void isWinPositionForSecondDiagonal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][1] = 0;
        field[2][0] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForSecondDiagonal PASSED");
        } else {
            System.out.println("isWinPositionForSecondDiagonal FAILED");
        }
    }
}
