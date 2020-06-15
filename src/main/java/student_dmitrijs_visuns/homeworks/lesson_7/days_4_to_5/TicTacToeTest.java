package student_dmitrijs_visuns.homeworks.lesson_7.days_4_to_5;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest newTest = new TicTacToeTest();
        newTest.createEmptyGameFieldTest();
        newTest.checkForEmptySpacesTest1();
        newTest.checkForEmptySpacesTest2();


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


}
