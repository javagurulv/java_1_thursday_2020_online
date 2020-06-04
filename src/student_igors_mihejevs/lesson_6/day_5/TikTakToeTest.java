package student_igors_mihejevs.lesson_6.day_5;

class TikTakToeTest {

    public static void main(String[] args) {
        TikTakToeTest tTTTest = new TikTakToeTest();

        int[][] arr1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] arr2 = {{1, 0, 1}, {0, 0, 0}, {0, 0, 1}};
        int[][] arr3 = {{1, 0, 0}, {1, 0, 0}, {0, 0, 0}};
        int[][] arr4 = {{1, 1, 1}, {1, 1, 0}, {1, 1, 0}};
        int[][] arr5 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int[][] arr6 = {{1, 0, 1}, {0, 0, 1}, {1, 1, 1}};
        int[][] arr7 = {{1, 0, 1}, {0, 1, 1}, {1, 0, 0}};

        System.out.println("\nMethod isWinPositionForHorizontals");
        System.out.println("Test of win positions in the field for horizontals for different situations");
        System.out.println("---------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr6, 1);
        System.out.println("\nTest of not win positions in the field for horizontals for different situations");
        System.out.println("---------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr4, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr5, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr6, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr1, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr2, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr3, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 1);

        System.out.println("\nMethod isWinPositionForVerticals");
        System.out.println("Test of win positions in the field for verticals for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr6, 1);
        System.out.println("\nTest of not win positions in the field for verticals for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr4, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr5, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr6, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr1, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr2, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr3, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsFalseSituation(arr7, 1);

        int[][] arr8 = {{0, 0, 1}, {0, 0, 1}, {0, 1, 0}};
        int[][] arr9 = {{1, 0, 0}, {0, 0, 1}, {0, 1, 0}};
        int[][] arr10 = {{1, 0, 1}, {0, 1, 1}, {1, 0, 1}};
        int[][] arr11 = {{0, 0, 1}, {0, 1, 1}, {1, 0, 0}};
        int[][] arr12 = {{0, 1, 1}, {0, 1, 1}, {0, 1, 0}};

        System.out.println("\nMethod isWinPositionForDiagonals");
        System.out.println("Test of win positions in the field for diagonals for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr8, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr9, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr10, 1);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr11, 1);
        System.out.println("\nTest of not win positions in the field for diagonals for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForDiagonalsFalseSituation(arr12, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsFalseSituation(arr12, 1);

        System.out.println("\nMethod isWinPosition");
        System.out.println("Test of win positions for the field for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr8, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr9, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr6, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr6, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr10, 1);
        tTTTest.shouldReturnIsWinPositionForAllFieldTrueSituation(arr11, 1);
        System.out.println("\nTest not win positions for the field for different situations");
        System.out.println("--------------------------------------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForAllFieldFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForAllFieldFalseSituation(arr8, 1);
    }

    void shouldReturnIsWinPositionForHorizontalsTrueSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForHorizontals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForHorizontalsFalseSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForHorizontals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForVerticalsTrueSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForVerticals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForVerticalsFalseSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForVerticals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForDiagonalsTrueSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForDiagonals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForDiagonalsFalseSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPositionForDiagonals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForAllFieldTrueSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPosition(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForAllFieldFalseSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        boolean result = myArray.isWinPosition(testArray, player);
        printWinTestResult(!result, player);
    }

    void printWinTestResult(boolean result, int player) {
        if (result)
            System.out.println("Player " + player + " - OK");
        else System.out.println("Player " + player + " - FAIL");
    }

}
