package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForFirstHorizontal();
        test.isWinPositionForSecondHorizontal();
        test.isWinPositionForThirdHorizontal();
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
}
