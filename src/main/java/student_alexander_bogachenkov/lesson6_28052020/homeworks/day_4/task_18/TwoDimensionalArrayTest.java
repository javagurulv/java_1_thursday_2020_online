package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_4.task_18;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldSumAllNumbers();
    }

    public void shouldSumAllNumbers() {
        int[][] testArray = new int[2][2];
        testArray[0][0] = 4;
        testArray[0][1] = 6;
        testArray[1][0] = 3;
        testArray[1][1] = 7;
        int expectedResult = 20;
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int actualResult = twoDimensionalArray.sumAllNumbers(testArray);

        if (actualResult == expectedResult) {
            System.out.println("shouldSumAllNumbers PASSED");
        } else {
            System.out.println("shouldSumAllNumbers FAILED");
        }
    }
}
