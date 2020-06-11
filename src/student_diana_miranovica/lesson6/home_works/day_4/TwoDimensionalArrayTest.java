package student_diana_miranovica.lesson6.home_works.day_4;

public class TwoDimensionalArrayTest {

    private int [][] arrayTest;
    private final TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.doubleArrayTest();


    }

    public void addRandomArrayValueTest(){

    }

    public void doubleArrayTest(){
        arrayTest = twoDimensionalArray.createDoubleArray(2,2);
        printTestResult(((arrayTest.length ==2)&&(arrayTest.length == 2)),"create array");

    }
    private void printTestResult(boolean isResultOk,String arrayTest) {
        if (isResultOk) {
            System.out.println("Two Dimensional Array test - " + arrayTest + " = OK");
        } else {
            System.out.println("Two Dimensional Array test - " + arrayTest + " = FAIL");
        }
    }
}
