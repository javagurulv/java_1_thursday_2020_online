package student_dmitrijs_visuns.homeworks.lesson_6.day_5;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest newTest = new TicTacToeTest();

        newTest.createEmptyGameFieldTest();
        newTest.isWinPositionForHorizontalsTest1();
        newTest.isWinPositionForHorizontalsTest2();
        newTest.isWinPositionForHorizontalsTest3();
        newTest.isWinPositionForVerticalsTest1();
        newTest.isWinPositionForVerticalsTest2();
        newTest.isWinPositionForVerticalsTest3();
        newTest.isWinPositionForDiagonalsTest1();
        newTest.isWinPositionForDiagonalsTest2();
        newTest.checkForEmptySpacesTest1();
        newTest.checkForEmptySpacesTest2();
        newTest.isDrawPositionTest();
        newTest.isWinPositionForFirstPlayerTest();
        newTest.isWinPositionForSecondPlayerTest();


    }


    public void createEmptyGameFieldTest(){
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = testTacToe.createEmptyGameField();
        int sumOfAllSpaces = 0;
        for (int i = 0; i < newField.length; i++) {
            for (int j = 0; j < newField[i].length; j++) {
                sumOfAllSpaces += newField[i][j];
            }
        }
        if (sumOfAllSpaces < 0) {
            System.out.println("Create empty game field test - OK");
        } else {
            System.out.println("Create empty game field test - FAIL");
        }

    }


    public void isWinPositionForHorizontalsTest1 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {0, 0, 0}, {-1, -1, -1}, {-1, -1, -1} };
        if (testTacToe.isWinPositionForHorizontals(newField, 0)) {
            System.out.println("Horizontal winning position test #1 - OK");
        } else {
            System.out.println("Horizontal winning position test #1 - FAIL");
        }
    }

    public void isWinPositionForHorizontalsTest2 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {-1, -1, -1}, {0, 0, 0}, {-1, -1, -1} };
        if (testTacToe.isWinPositionForHorizontals(newField, 0)) {
            System.out.println("Horizontal winning position test #2 - OK");
        } else {
            System.out.println("Horizontal winning position test #2 - FAIL");
        }
    }

    public void isWinPositionForHorizontalsTest3 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {-1, -1, -1}, {-1, -1, -1}, {0, 0, 0} };
        if (testTacToe.isWinPositionForHorizontals(newField, 0)) {
            System.out.println("Horizontal winning position test #3 - OK");
        } else {
            System.out.println("Horizontal winning position test #3 - FAIL");
        }
    }

    public void isWinPositionForVerticalsTest1 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {0, -1, -1}, {0, -1, -1}, {0, -1, -1} };
        if (testTacToe.isWinPositionForVerticals(newField, 0)) {
            System.out.println("Vertical winning position test #1 - OK");
        } else {
            System.out.println("Vertical winning position test #1 - FAIL");
        }
    }

    public void isWinPositionForVerticalsTest2 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {-1, 0, -1}, {-1, 0, -1}, {-1, 0, -1} };
        if (testTacToe.isWinPositionForVerticals(newField, 0)) {
            System.out.println("Vertical winning position test #2 - OK");
        } else {
            System.out.println("Vertical winning position test #2 - FAIL");
        }
    }

    public void isWinPositionForVerticalsTest3 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {-1, -1, 0}, {-1, -1, 0}, {-1, -1, 0} };
        if (testTacToe.isWinPositionForVerticals(newField, 0)) {
            System.out.println("Vertical winning position test #3 - OK");
        } else {
            System.out.println("Vertical winning position test #3 - FAIL");
        }
    }

    public void isWinPositionForDiagonalsTest1 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {0, -1, -1}, {-1, 0, -1}, {-1, -1, 0} };
        if (testTacToe.isWinPositionForDiagonals(newField, 0)) {
            System.out.println("Diagonal winning position test #1 - OK");
        } else {
            System.out.println("Diagonal winning position test #1 - FAIL");
        }
    }

    public void isWinPositionForDiagonalsTest2 () {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {-1, -1, 0}, {-1, 0, -1}, {0, -1, -1} };
        if (testTacToe.isWinPositionForDiagonals(newField, 0)) {
            System.out.println("Diagonal winning position test #2 - OK");
        } else {
            System.out.println("Diagonal winning position test #2 - FAIL");
        }
    }


    public void checkForEmptySpacesTest1() {
        TicTacToe testTacToe = new TicTacToe();

        int[][] newField = testTacToe.createEmptyGameField();
        if (testTacToe.isEmptySpaces(newField)) {
            System.out.println("Check empty spaces test (gamefield has empty spaces)- OK");
        } else {System.out.println("Check empty spaces test (gamefield has empty spaces)- FAIL");
        }
    }

    public void checkForEmptySpacesTest2() {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] {{0,0,0}, {1,1,1}, {0,0,0}};
        if (testTacToe.isEmptySpaces(newField)) {
            System.out.println("Check empty spaces test (gamefield without empty spaces)- FAIL");
        } else System.out.println("Check empty spaces test (gamefield without empty spaces)- OK");

    }

    public void isDrawPositionTest() {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] {{1,0,1}, {1,1,0}, {0,1,0}};
        if (testTacToe.isDrawPosition(newField)) {
            System.out.println("Draw position test - OK");
        } else System.out.println("Draw position test - FAIL");
    }

    public void isWinPositionForFirstPlayerTest() {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {0, 0, 0}, {-1, -1, -1}, {-1, -1, -1} };
        if (testTacToe.isWinPositionForFirstPlayer(newField)) {
            System.out.println("Player 1 win test - OK");
        } else System.out.println("Player 1 win test - FAIL");
    }


    public void isWinPositionForSecondPlayerTest() {
        TicTacToe testTacToe = new TicTacToe();
        int[][] newField = new int[][] { {1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
        if (testTacToe.isWinPositionForSecondPlayer(newField)) {
            System.out.println("Player 2 win test - OK");
        } else System.out.println("Player 2 win test - FAIL");
    }

}