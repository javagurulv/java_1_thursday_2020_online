package student_vadims_vladisevs.lesson6.day_6;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest temp = new TicTacToeTest();
        temp.testCreateField();

    }

    public void testCreateField(){
        TicTacToe test = new TicTacToe();
        int[][] testGameField = test.createField();
        boolean result = test.isFieldEmpty(testGameField);
        printTestResult(true, result, "Create game field");

    }





    public void printTestResult(boolean expectedResult, boolean result, String testName){
        if (result == expectedResult){
            System.out.println(testName + " test = OK! Expected result: " + expectedResult + " . Result: " + result);
        } else {
            System.out.println(testName + " test = FAIL! Expected result: " + expectedResult + " . Result: " + result);
        }
    }
}
