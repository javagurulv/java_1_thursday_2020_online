package student_igors_mihejevs.lesson_6.day_5;

class TikTakToeTest {

    public static void main(String[] args) {
        TikTakToeTest tTTTest = new TikTakToeTest();

        int[][] arr1 = {{0, 0, 0}, {0, 1, 0}, {1, 0, 1}};
        int[][] arr2 = {{1, 0, 1}, {0, 0, 0}, {0, 1, 0}};
        int[][] arr3 = {{1, 0, 1}, {1, 0, 1}, {0, 0, 0}};
        int[][] arr4 = {{1, 1, 1}, {0, 1, 0}, {1, 1, 0}};
        int[][] arr5 = {{1, 0, 1}, {1, 1, 1}, {0, 1, 0}};
        int[][] arr6 = {{1, 0, 1}, {0, 0, 1}, {1, 1, 1}};
        int[][] arr7 = {{1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr1, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr2, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr3, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr4, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr5, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr6, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 0);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr1, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr2, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr3, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr4, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr5, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsTrueSituation(arr6, 1);
        tTTTest.shouldReturnIsWinPositionForHorizontalsFalseSituation(arr7, 1);
    }

    void shouldReturnIsWinPositionForHorizontalsTrueSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        if (myArray.isWinPositionForHorizontals(testArray, player))
            System.out.println("Test of win position of player " + player + " in the field - OK");
        else System.out.println("Test of win position in the field - FAIL");
    }

    void shouldReturnIsWinPositionForHorizontalsFalseSituation(int[][] testArray, int player) {
        TicTacToe myArray = new TicTacToe();
        if (!myArray.isWinPositionForHorizontals(testArray, player))
            System.out.println("Test of lost position of player " + player + " in the field - OK");
        else System.out.println("Test of lost position of player " + player + " in the field - FAIL");
    }

}
