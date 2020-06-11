package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_5;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForFirstHorizontal();
        test.isWinPositionForSecondHorizontal();
        test.isWinPositionForThirdHorizontal();
        System.out.println();
        test.isWinPositionForFirstVertical();
        test.isWinPositionForSecondVertical();
        test.isWinPositionForThirdVertical();
        System.out.println();
        test.isWinPositionForFirstDiagonal();
        test.isWinPositionForSecondDiagonal();
        System.out.println();
        test.isWinPositionTest1();
        test.isWinPositionTest2();
        test.isWinPositionTest3();
        System.out.println();
        test.isDrawPositionTest();
        System.out.println();
        test.shouldCreateFieldAndFillWithMinusOne();
    }

    public void shouldCreateFieldAndFillWithMinusOne() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] testArray = ticTacToe.createField();
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                System.out.print(testArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void isWinPositionForFirstHorizontal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[0][1] = 1;
        field[0][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,1);

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
        field[2][0] = 1;
        field[2][1] = 1;
        field[2][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForThirdHorizontal PASSED");
        } else {
            System.out.println("isWinPositionForThirdHorizontal FAILED");
        }
    }

    public void isWinPositionForFirstVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[1][0] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForFirstVertical PASSED");
        } else {
            System.out.println("isWinPositionForFirstVertical FAILED");
        }
    }

    public void isWinPositionForSecondVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][1] = 1;
        field[1][1] = 1;
        field[2][1] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForSecondVertical PASSED");
        } else {
            System.out.println("isWinPositionForSecondVertical FAILED");
        }
    }

    public void isWinPositionForThirdVertical() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 1;
        field[1][2] = 1;
        field[2][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForThirdVertical PASSED");
        } else {
            System.out.println("isWinPositionForThirdVertical FAILED");
        }
    }

    public void isWinPositionForFirstDiagonal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[1][1] = 1;
        field[2][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForFirstDiagonal PASSED");
        } else {
            System.out.println("isWinPositionForFirstDiagonal FAILED");
        }
    }

    public void isWinPositionForSecondDiagonal() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 1;
        field[1][1] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForSecondDiagonal PASSED");
        } else {
            System.out.println("isWinPositionForSecondDiagonal FAILED");
        }
    }

    public void isWinPositionTest1() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[1][0] = 1;
        field[1][1] = 1;
        field[1][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionTest1 PASSED");
        } else {
            System.out.println("isWinPositionTest1 FAILED");
        }
    }

    public void isWinPositionTest2() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[1][0] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionTest2 PASSED");
        } else {
            System.out.println("isWinPositionTest2 FAILED");
        }
    }

    public void isWinPositionTest3() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 1;
        field[1][1] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionTest3 PASSED");
        } else {
            System.out.println("isWinPositionTest3 FAILED");
        }
    }

    public void isDrawPositionTest() {
        int[][] field = new int[3][3];
        field[0][0] = 0;
        field[0][1] = 0;
        field[0][2] = 1;
        field[1][0] = 1;
        field[1][1] = 0;
        field[1][2] = 0;
        field[2][0] = 0;
        field[2][1] = 1;
        field[2][2] = 1;
        TicTacToe ticTacToe = new TicTacToe();
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isDrawPosition(field);

        if (actualResult == expectedResult) {
            System.out.println("isDrawPositionTest PASSED");
        } else {
            System.out.println("isDrawPositionTest FAILED");
        }
    }
}
