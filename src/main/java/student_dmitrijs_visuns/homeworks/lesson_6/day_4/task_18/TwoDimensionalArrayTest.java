package student_dmitrijs_visuns.homeworks.lesson_6.day_4.task_18;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest newTest = new TwoDimensionalArrayTest();
        newTest.sumArrayTest();

    }


    public void sumArrayTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] array = new int[][] {{1, 1, 1}, {1, 1, 1 }, {1, 1, 1}};
        if (twoDimensionalArray.sumArrayNumbers(array) == 9) {
            System.out.println("Two dimensional array sum test - OK");
        } else {
            System.out.println("Two dimensional array sum test - FAIL");
        }


    }


}
