package student_vadim_sokolenko.Lesson6HomeWorks.Day4;

public class TwoDimensionTest {

    public static void main(String[] args) {

        TwoDimensionTest newTest = new TwoDimensionTest();
        newTest.sumArrayTest();
        newTest.randomNumberArrayTest();
    }

    private void sumArrayTest() {

        TwoDimensionArray twoDimensionArray = new TwoDimensionArray();
        int [][] array = new int [][]{{1,2,3},{3,3,3},{2,2,2}};
        if (twoDimensionArray.sumOfTwoDimensionArray(array)== 21) {
            System.out.println("Two dimension array sum test - OK");
        }else {
            System.out.println("Two dimension array sum test - FAIL!");
        }


    }
    private void randomNumberArrayTest(){

    }
}
