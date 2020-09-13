package student_igors_mihejevs.lesson_6.homework.level_5_6;

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

        System.out.println("\nMethod isWinPositionForHorizontals (true)");
        System.out.println("-----------------------------------------");
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr6, 1);
        System.out.println("\nMethod isWinPositionForHorizontals (false)");
        System.out.println("------------------------------------------");
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr4, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr5, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr6, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr1, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr2, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr3, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 1);

        System.out.println("\nMethod isWinPositionForVerticals (true)");
        System.out.println("---------------------------------------");
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForVerticalsTrueSituation(arr6, 1);
        System.out.println("\nMethod isWinPositionForVerticals (false)");
        System.out.println("----------------------------------------");
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
        int[][] arr12 = {{1, 0, 1}, {1, 0, 0}, {0, 1, 1}};

        System.out.println("\nMethod isWinPositionForDiagonals (true)");
        System.out.println("---------------------------------------");
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr8, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr9, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr10, 1);
        tTTTest.shouldReturnIsWinPositionForDiagonalsTrueSituation(arr11, 1);
        System.out.println("\nMethod isWinPositionForDiagonals (false)");
        System.out.println("----------------------------------------");
        tTTTest.shouldReturnIsWinPositionForDiagonalsFalseSituation(arr12, 0);
        tTTTest.shouldReturnIsWinPositionForDiagonalsFalseSituation(arr12, 1);

        System.out.println("\nMethod isWinPosition (true)");
        System.out.println("---------------------------");
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr8, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr9, 0);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr6, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr6, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr10, 1);
        tTTTest.shouldReturnIsWinPositionForFieldTrueSituation(arr11, 1);
        System.out.println("\nMethod isWinPosition (false)");
        System.out.println("----------------------------");
        tTTTest.shouldReturnIsWinPositionForFieldFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForFieldFalseSituation(arr8, 1);

        System.out.println("\nMethod isDrawPosition (true)");
        System.out.println("----------------------------");
        tTTTest.shouldReturnIsDrawPositionForFieldTrueSituation(arr12);
        tTTTest.shouldReturnIsDrawPositionForFieldTrueSituation(arr12);
        int[][] arr14 = {{1, 0, 1}, {1, -1, 0}, {0, 1, 1}};
        System.out.println("\nMethod isDrawPosition (false)");
        System.out.println("-----------------------------");
        tTTTest.shouldReturnIsDrawPositionForFieldFalseSituation(arr1);
        tTTTest.shouldReturnIsDrawPositionForFieldFalseSituation(arr4);
        tTTTest.shouldReturnIsDrawPositionForFieldFalseSituation(arr14);

        tTTTest.shouldReturnNewInitializedField();
    }

    void shouldReturnIsWinPositionForHorizontalsTrueSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForHorizontals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForHorizontalsFalseSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForHorizontals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForVerticalsTrueSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForVerticals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForVerticalsFalseSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForVerticals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForDiagonalsTrueSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForDiagonals(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForDiagonalsFalseSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPositionForDiagonals(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsWinPositionForFieldTrueSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPosition(testArray, player);
        printWinTestResult(result, player);
    }

    void shouldReturnIsWinPositionForFieldFalseSituation(int[][] testArray, int player) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isWinPosition(testArray, player);
        printWinTestResult(!result, player);
    }

    void shouldReturnIsDrawPositionForFieldTrueSituation(int[][] testArray) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isDrawPosition(testArray);
        if (result) System.out.println("Test - OK");
        else System.out.println("Test - FAIL");
    }

    void shouldReturnIsDrawPositionForFieldFalseSituation(int[][] testArray) {
        TicTacToe tTT = new TicTacToe();
        boolean result = tTT.isDrawPosition(testArray);
        if (!result) System.out.println("Test - OK");
        else System.out.println("Test - FAIL");
    }

    void shouldReturnNewInitializedField() {
        TicTacToe tTT = new TicTacToe();
        int[][] result = tTT.createField();
        // tTT.printFieldToConsole(result);
        boolean isInitialize = true;
        for (int[] ints : result) {
            for (int anInt : ints) {
                if (anInt != -1) {
                    isInitialize = false;
                    break;
                }
            }
            if (!isInitialize) break;
        }
        System.out.println("\nMethod createField");
        System.out.println("------------------");
        if (result.length == 3 && result[0].length == 3 && isInitialize) System.out.println("Test - OK");
        else System.out.println("Test - FAIL");
    }

    void printWinTestResult(boolean result, int player) {
        if (result)
            System.out.println("Player " + player + " - OK");
        else System.out.println("Player " + player + " - FAIL");
    }

}
