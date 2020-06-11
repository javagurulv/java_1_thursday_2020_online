package student_aleksey_kodin.lesson6.day5.task_20;

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
