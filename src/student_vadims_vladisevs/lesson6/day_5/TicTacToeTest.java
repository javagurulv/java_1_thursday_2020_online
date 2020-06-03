package student_vadims_vladisevs.lesson6.day_5;

class TicTacToeTest {
    public static void main(String[] args) {
    TicTacToeTest temp = new TicTacToeTest();
    temp.testWinPositionForHorizontalsV1();
    temp.testWinPositionForHorizontalsV2();
    temp.testWinPositionForHorizontalsV3();
    temp.testWinPositionForHorizontalsV4();
    temp.testWinPositionForHorizontalsV5();
    temp.testWinPositionForHorizontalsV6();
    temp.testWinPositionForHorizontalsFalse();
    temp.testWinPositionForVerticalsV1();
    temp.testWinPositionForVerticalsV2();
    temp.testWinPositionForVerticalsV3();
    temp.testWinPositionForVerticalsV4();
    temp.testWinPositionForVerticalsV5();
    temp.testWinPositionForVerticalsV6();
    temp.testWinPositionForVerticalsFalse();
    temp.testWinPositionForDiagonalsV1();
    temp.testWinPositionForDiagonalsV2();
    temp.testWinPositionForDiagonalsV3();
    temp.testWinPositionForDiagonalsV4();
    temp.testWinPositionForDiagonalsFalse();
    temp.testWinPositionFalse();
    temp.testWinPositionV1();
    temp.testWinPositionV2();
    temp.testWinPositionV3();
    temp.testWinPositionV4();
    temp.testWinPositionV5();
    temp.testWinPositionV6();
    temp.testDrawPosition();
    temp.testDrawPositionFalse();



    }

    public void testDrawPositionFalse(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,1,0}, {0,1,-1}, {0,-1,1}};
        boolean result = test.isDrawPosition(testGameField);
        printTestResult(false, result, "Draw position is false");
    }

    public void testDrawPosition(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,0,1}, {1,1,0}, {0,1,1}};
        boolean result = test.isDrawPosition(testGameField);
        printTestResult(true, result, "Draw position");
    }

    public void testWinPositionV6(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,-1,-1}, {1,-1,-1}, {1,-1,-1}};
        boolean result = test.isWinPosition(testGameField, 1);
        printTestResult(true, result, "Win position V6");
    }

    public void testWinPositionV5(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,-1,-1}, {-1,1,-1}, {-1,-1,1}};
        boolean result = test.isWinPosition(testGameField, 1);
        printTestResult(true, result, "Win position V5");
    }

    public void testWinPositionV4(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,-1,-1}, {0,-1,-1}, {0,-1,-1}};
        boolean result = test.isWinPosition(testGameField, 0);
        printTestResult(true, result, "Win position V4");
    }

    public void testWinPositionV3(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,-1,-1}, {-1,0,-1}, {-1,-1,0}};
        boolean result = test.isWinPosition(testGameField, 0);
        printTestResult(true, result, "Win position V3");
    }

    public void testWinPositionV2(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,1,1}, {-1,1,-1}, {1,-1,-1}};
        boolean result = test.isWinPosition(testGameField, 1);
        printTestResult(true, result, "Win position V2");
    }

    public void testWinPositionV1(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,0,0}, {-1,1,-1}, {1,-1,-1}};
        boolean result = test.isWinPosition(testGameField, 0);
        printTestResult(true, result, "Win position V1");
    }


    public void testWinPositionFalse(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,1}, {-1,1,-1}, {1,-1,-1}};
        boolean result = test.isWinPosition(testGameField, 0);
        printTestResult(false, result, "Win position is false");
    }

    public void testWinPositionForDiagonalsV4(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,1}, {-1,1,-1}, {1,-1,-1}};
        boolean result = test.isWinPositionForDiagonals(testGameField, 1);
        printTestResult(true, result, "Win position for diagonals V4");
    }

    public void testWinPositionForDiagonalsV3(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,-1,1}, {-1,1,-1}, {-1,-1,1}};
        boolean result = test.isWinPositionForDiagonals(testGameField, 1);
        printTestResult(true, result, "Win position for diagonals V3");
    }

    public void testWinPositionForDiagonalsFalse(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,0}, {-1,-1,-1}, {0,-1,-1}};
        boolean result = test.isWinPositionForDiagonals(testGameField, 0);
        printTestResult(false, result, "Win position for diagonals is false");
    }

    public void testWinPositionForDiagonalsV2(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,0}, {-1,0,-1}, {0,-1,-1}};
        boolean result = test.isWinPositionForDiagonals(testGameField, 0);
        printTestResult(true, result, "Win position for diagonals V2");
    }

    public void testWinPositionForDiagonalsV1(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,-1,1}, {-1,0,-1}, {-1,-1,0}};
        boolean result = test.isWinPositionForDiagonals(testGameField, 0);
        printTestResult(true, result, "Win position for diagonals V1");
    }

    public void testWinPositionForVerticalsFalse(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,0,1}, {-1,-1,-1}, {-1,-1,-1}};
        boolean result = test.isWinPositionForVerticals(testGameField,1);
        printTestResult(false, result, "Win position for verticals is false");
    }

    public void testWinPositionForVerticalsV6(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,1}, {-1,-1,1}, {-1,-1,1}};
        boolean result = test.isWinPositionForVerticals(testGameField,1);
        printTestResult(true, result, "Win position for verticals V6");
    }

    public void testWinPositionForVerticalsV5(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,1,-1}, {-1,1,-1}, {-1,1,-1}};
        boolean result = test.isWinPositionForVerticals(testGameField,1);
        printTestResult(true, result, "Win position for verticals V5");
    }


    public void testWinPositionForVerticalsV4(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,-1,-1}, {1,-1,-1}, {1,-1,-1}};
        boolean result = test.isWinPositionForVerticals(testGameField,1);
        printTestResult(true, result, "Win position for verticals V4");
    }

    public void testWinPositionForVerticalsV3(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,0}, {-1,-1,0}, {-1,-1,0}};
        boolean result = test.isWinPositionForVerticals(testGameField,0);
        printTestResult(true, result, "Win position for verticals V3");
    }

    public void testWinPositionForVerticalsV2(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,0,-1}, {-1,0,-1}, {-1,0,-1}};
        boolean result = test.isWinPositionForVerticals(testGameField,0);
        printTestResult(true, result, "Win position for verticals V2");
    }


    public void testWinPositionForVerticalsV1(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,-1,-1}, {0,-1,-1}, {0,-1,-1}};
        boolean result = test.isWinPositionForVerticals(testGameField,0);
        printTestResult(true, result, "Win position for verticals V1");
    }


    public void testWinPositionForHorizontalsFalse(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,0,1}, {-1,-1,-1}, {-1,-1,-1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,0);
        printTestResult(false, result, "Win position for horizontals is false");
    }


    public void testWinPositionForHorizontalsV1(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{0,0,0}, {-1,-1,-1}, {-1,-1,-1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,0);
        printTestResult(true, result, "Win position for horizontals V1");
    }

    public void testWinPositionForHorizontalsV2(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,-1}, {0,0,0}, {-1,-1,-1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,0);
        printTestResult(true, result, "Win position for horizontals V2");
    }

    public void testWinPositionForHorizontalsV3(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,-1}, {-1,-1,-1}, {0,0,0}};
        boolean result = test.isWinPositionForHorizontals(testGameField,0);
        printTestResult(true, result, "Win position for horizontals V3");
    }

    public void testWinPositionForHorizontalsV4(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{1,1,1}, {-1,-1,-1}, {-1,-1,-1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,1);
        printTestResult(true, result, "Win position for horizontals V4");
    }

    public void testWinPositionForHorizontalsV5(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,-1}, {1,1,1}, {-1,-1,-1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,1);
        printTestResult(true, result, "Win position for horizontals V5");
    }

    public void testWinPositionForHorizontalsV6(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = {{-1,-1,-1}, {-1,-1,-1}, {1,1,1}};
        boolean result = test.isWinPositionForHorizontals(testGameField,1);
        printTestResult(true, result, "Win position for horizontals V6");
    }




    public void printTestResult(boolean expectedResult, boolean result, String testName){
        if (result == expectedResult){
            System.out.println(testName + " test = OK! Expected result: " + expectedResult + " . Result: " + result);
        } else {
            System.out.println(testName + " test = FAIL! Expected result: " + expectedResult + " . Result: " + result);
        }
    }
}
