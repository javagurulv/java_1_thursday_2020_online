package student_aleksey_kodin.lesson6.day5.task_23;

class TicTacToeTest {
    private final TicTacToe ticTacToe = new TicTacToe();
    private static final int[][]field = new int[3][3];

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.createPlayBoard(field);
        printGameBoard(field);
        System.out.println("Tic Tac Toe test - create Game Board = OK");
        ticTacToeTest.testWinPositionForHorizontals();
        ticTacToeTest.createPlayBoard(field);
        ticTacToeTest.testWinPositionForVerticals();
        ticTacToeTest.createPlayBoard(field);
        ticTacToeTest.testWinPositionForDiagonals();
        ticTacToeTest.createPlayBoard(field);
        ticTacToeTest.testisWinPosition();
        ticTacToeTest.testisDrawPosition();
    }
    public void testWinPositionForHorizontals() {
        field[1][0] = field[1][1] = field[1][2] = 0;
        printGameBoard(field);
        boolean result = ticTacToe.isWinPositionForHorizontals(field,0);
        printTestResult(result,"win position for horizontals");
        field[1][2] = 1;
        printGameBoard(field);
        boolean resultNoWinPosition = ticTacToe.isWinPositionForHorizontals(field,0);
        printTestResult(!resultNoWinPosition,"no win position for horizontals");
    }
    public void testWinPositionForVerticals() {
        field[0][1] = field[1][1] = field[2][1] = 0;
        printGameBoard(field);
        boolean result = ticTacToe.isWinPositionForVerticals(field,0);
        printTestResult(result,"win position for verticals");
        field[2][1] = 1;
        printGameBoard(field);
        boolean resultNoWinPosition = ticTacToe.isWinPositionForVerticals(field,0);
        printTestResult(!resultNoWinPosition,"no win position for verticals");
    }
    public void testWinPositionForDiagonals() {
        field[0][0] = field[1][1] = field[2][2] = 0;
        printGameBoard(field);
        boolean resultFirstDiagonal = ticTacToe.isWinPositionForDiagonals(field,0);
        printTestResult(resultFirstDiagonal,"win position for 1st diagonals");

        createPlayBoard(field);
        field[0][2] = field[1][1] = field[2][0] = 0;
        printGameBoard(field);
        boolean resultSecondDiagonal = ticTacToe.isWinPositionForDiagonals(field,0);
        printTestResult(resultSecondDiagonal,"win position for 2nd diagonals");

        createPlayBoard(field);
        field[0][2] = field[1][1] = 0;
        field[2][0] = 1;
        printGameBoard(field);
        boolean resultNoDiagonalFirstVariant = ticTacToe.isWinPositionForDiagonals(field,0);
        printTestResult(!resultNoDiagonalFirstVariant,"no win position for diagonals 1st variant");

        createPlayBoard(field);
        field[0][0] = field[1][1] = 0;
        field[2][2] = 1;
        printGameBoard(field);
        boolean resultNoDiagonalSecondVariant = ticTacToe.isWinPositionForDiagonals(field,0);
        printTestResult(!resultNoDiagonalSecondVariant,"no win position for diagonals 2nd variant");

        createPlayBoard(field);
        field[0][0] = field[2][2] = 1;
        field[1][1] = 0;
        printGameBoard(field);
        boolean resultNoDiagonalThirdVariant = ticTacToe.isWinPositionForDiagonals(field,0);
        printTestResult(!resultNoDiagonalThirdVariant,"no win position for diagonals 3rd variant");
    }
    public void testisWinPosition() {
        field[1][1] = field[1][2] = 0;
        field[1][0] = -1;
        printGameBoard(field);
        boolean resultHorizontalFirstVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultHorizontalFirstVariant,"win position for horizontal 1st variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[1][0] = field[1][2] = 1;
        field[1][1] = -1;
        printGameBoard(field);
        boolean resultHorizontalSecondVariant = ticTacToe.isWinPosition(field,1);
        printTestResult(resultHorizontalSecondVariant,"win position for horizontal 2nd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[2][0] = field[2][1] = 1;
        field[2][2] = -1;
        printGameBoard(field);
        boolean resultHorizontalThirdVariant = ticTacToe.isWinPosition(field,1);
        printTestResult(resultHorizontalThirdVariant,"win position for horizontal 3rd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][0] = field[1][0] = 0;
        field[2][0] = -1;
        printGameBoard(field);
        boolean resultVerticalFirstVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultVerticalFirstVariant,"win position for vertical 1st variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][1] = field[2][1] = 0;
        field[1][1] = -1;
        printGameBoard(field);
        boolean resultVerticalSecondVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultVerticalSecondVariant,"win position for vertical 2nd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[1][2] = field[2][2] = 0;
        field[0][2] = -1;
        printGameBoard(field);
        boolean resultVerticalThirdVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultVerticalThirdVariant,"win position for vertical 2nd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][0] = field[2][2] = 0;
        field[1][1] = -1;
        printGameBoard(field);
        boolean resultDiagonalFirstVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalFirstVariant,"win position for diagonal 1st variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][0] = field[1][1] = 0;
        field[2][2] = -1;
        printGameBoard(field);
        boolean resultDiagonalSecondVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalSecondVariant,"win position for diagonal 2nd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[1][1] = field[2][2] = 0;
        field[0][0] = -1;
        printGameBoard(field);
        boolean resultDiagonalThirdVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalThirdVariant,"win position for diagonal 3rd variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][2] = field[1][1] = 0;
        field[2][0] = -1;
        printGameBoard(field);
        boolean resultDiagonalFourthVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalFourthVariant,"win position for diagonal 4th variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[0][2] = field[2][0] = 0;
        field[1][1] = -1;
        printGameBoard(field);
        boolean resultDiagonalFifthVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalFifthVariant,"win position for diagonal 5th variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");

        createPlayBoard(field);
        field[1][1] = field[2][0] = 0;
        field[0][2] = -1;
        printGameBoard(field);
        boolean resultDiagonalSixthVariant = ticTacToe.isWinPosition(field,0);
        printTestResult(resultDiagonalSixthVariant,"win position for diagonal 6th variant");
        System.out.println("Win position row[" + ticTacToe.getRowWinPosition() + "] column[" + ticTacToe.getColumnWinPosition() + "]");
    }
    public void testisDrawPosition() {
        createPlayBoard(field);
        field[1][1] = field[2][0] = field[0][0] =  field[1][2] =0;
        field[0][1] = field[0][2] = field[1][0] = field[2][1] = 1;
        printGameBoard(field);
        boolean resultDraw = ticTacToe.isDrawPosition(field,0);
        printTestResult(resultDraw,"no draw position ");

        createPlayBoard(field);
        field[1][1] = field[2][0] = field[0][0] =  field[1][2] =0;
        field[0][1] = field[0][2] = field[1][0] = field[2][1] = field[2][2] = 1;
        printGameBoard(field);
        boolean resultDrawSecond = ticTacToe.isDrawPosition(field,0);
        printTestResult(!resultDrawSecond,"draw position ");
    }
    private void createPlayBoard(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                field[row][column] = -1;
            }
        }
    }
    private static void printGameBoard(int[][] field) {
        for (int[] row : field) {
            System.out.println();
            for (int column = 0; column < field[0].length; column++) {
                if ((row[column] == 0) || (row[column] == 1)) {
                    System.out.print(" " + row[column] + " ");
                } else {
                    System.out.print(row[column] + " ");
                }
            }
        }
        System.out.println();
    }
    private void printTestResult(boolean isResultOk,String TicTacToe) {
        if (isResultOk) {
            System.out.println("Tic Tac Toe test - " + TicTacToe + " = OK");
        } else {
            System.out.println("Tic Tac Toe test - " + TicTacToe + " = FAIL");
        }
    }
}
