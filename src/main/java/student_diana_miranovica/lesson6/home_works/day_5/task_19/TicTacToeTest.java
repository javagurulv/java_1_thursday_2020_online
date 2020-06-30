package student_diana_miranovica.lesson6.home_works.day_5.task_19;



 class TicTacToeTest {

    private static final int[][]field = new int[3][3];
    private final TicTacToe ticTacToe = new TicTacToe();

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.isWinPositionHorizontalNumberOneTest();//task 19
        ticTacToeTest.isWinPositionHorizontalNumberTwoTest(); // task 19
        ticTacToeTest.isWinPositionHorizontalNumberThreeTest();// task 19
        ticTacToeTest.isWinPositionForVerticalsNumberOneTest(); // task 20
        ticTacToeTest.isWinPositionForVerticalsNumberTwoTest(); //task 20
        ticTacToeTest.isWinPositionForVerticalsNumberThreeTest(); // task 20
        ticTacToeTest.isWinPositionForDiagonalsNumberOneTest(); // task 21
        ticTacToeTest.isWinPositionForDiagonalsNumberTwoTest(); // task 21
        ticTacToeTest.isWinPositionFirstTest(); //task 22
        ticTacToeTest.isWinPositionSecondTest(); //task 22
        ticTacToeTest.isWinPositionThirdTest(); //task 22
        ticTacToeTest.isDrawPositionTest(); // task 23
        ticTacToeTest.createFieldTest(); // task 24


    }



    public void isWinPositionHorizontalNumberOneTest() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 0;
        field[0][1] = 0;
        field[0][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionHorizontalNumberOne - OK");
        } else {
            System.out.println("isWinPositionHorizontalNumberOne - FAILED");
        }
    }

    public void isWinPositionHorizontalNumberTwoTest() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[1][0] = 0;
        field[1][1] = 0;
        field[1][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionHorizontalNumberTwo - OK");
        } else {
            System.out.println("isWinPositionHorizontalNumberTwo - FAILED");
        }
    }

    public void isWinPositionHorizontalNumberThreeTest() {
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[2][0] = 0;
        field[2][1] = 0;
        field[2][2] = 0;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForHorizontals(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionHorizontalNumberThree - OK");
        } else {
            System.out.println("isWinPositionHorizontalNumberThree - FAILED");
        }
    }

    public void isWinPositionForVerticalsNumberOneTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[1][0] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field, 1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForVerticalsNumberOneTest - OK");
        } else {
            System.out.println("isWinPositionForVerticalsNumberOneTest - FAILED");
        }
    }

    public void isWinPositionForVerticalsNumberTwoTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][1] = 1;
        field[1][1] = 1;
        field[2][1] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForVerticalsNumberTwoTest - OK");
        } else {
            System.out.println("isWinPositionForVerticalsNumberTwoTest - FAILED");
        }
    }

    public void isWinPositionForVerticalsNumberThreeTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 1;
        field[1][2] = 1;
        field[2][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForVerticals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForVerticalsNumberThreeTest - OK");
        } else {
            System.out.println("isWinPositionForVerticalsNumberThreeTest - FAILED");
        }
    }

    public void isWinPositionForDiagonalsNumberOneTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][0] = 1;
        field[1][1] = 1;
        field[2][2] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForDiagonalsNumberOneTest - OK");
        } else {
            System.out.println("isWinPositionForDiagonalsNumberOneTest - FAILED");
        }
    }

    public void isWinPositionForDiagonalsNumberTwoTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 1;
        field[1][1] = 1;
        field[2][0] = 1;
        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPositionForDiagonals(field,1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionForDiagonalsNumberTwoTest - OK");
        } else {
            System.out.println("isWinPositionForDiagonalsNumberTwoTest - FAILED");
        }
    }

    public void isWinPositionFirstTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][1] = 0;
        field[2][0] = 0;
        field[0][1] = 1;
        field[0][0] = 1;
        field[1][2] = 1;
        field[1][0] = 1;
        field[2][1] = -1;
        field[2][2] = -1;

        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionFirstTest - OK");
        } else {
            System.out.println("isWinPositionFirstTest - FAILED");
        }
    }
    public void isWinPositionSecondTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][1] = -1;
        field[2][0] = 0;
        field[0][1] = 0;
        field[0][0] = 0;
        field[1][2] = 1;
        field[1][0] = 1;
        field[2][1] = -1;
        field[2][2] = 1;

        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionSecondTest - OK");
        } else {
            System.out.println("isWinPositionSecondTest - FAILED");
        }
    }

    public void isWinPositionThirdTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][1] = 1;
        field[2][0] = 1;
        field[0][1] = 0;
        field[0][0] = 1;
        field[1][2] = 0;
        field[1][0] = 1;
        field[2][1] = 1;
        field[2][2] = 0;

        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isWinPosition(field,0);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionThirdTest - OK");
        } else {
            System.out.println("isWinPositionThirdTest - FAILED");
        }
    }

    public void isDrawPositionTest(){
        int[][] field = new int[3][3];
        TicTacToe ticTacToe = new TicTacToe();
        field[0][2] = 0;
        field[1][1] = 1;
        field[2][0] = 1;
        field[0][1] = 0;
        field[0][0] = 0;
        field[1][2] = 1;
        field[1][0] = 1;
        field[2][1] = 1;
        field[2][2] = 0;

        boolean expectedResult = true;
        boolean actualResult = ticTacToe.isDrawPosition(field, 1);

        if (actualResult == expectedResult) {
            System.out.println("isWinPositionThirdTest - OK");
        } else {
            System.out.println("isWinPositionThirdTest - FAILED");
        }
    }
    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] field = new int[3][3];
        int result = 0;
        for(int i=0;i<field.length;i++) {
            for(int j=0;j<field.length;j++) {
                result+=field[i][j];
            }
        }
        if (result == 0 ) {
            System.out.println("createFieldTest - OK");
        } else {
            System.out.println("createFieldTest - FAIL");
        }

    }


}
