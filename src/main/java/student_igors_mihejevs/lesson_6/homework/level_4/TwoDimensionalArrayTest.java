package student_igors_mihejevs.lesson_6.homework.level_4;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();

        test.shouldCountAllNumbersInDoubleArray();
    }

    public void shouldCountAllNumbersInDoubleArray() {
        TwoDimensionalArray myArray = new TwoDimensionalArray();

        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // myArray.printDoubleArrayToConsole(testArray);

        if (myArray.sumOfAllNumbersFromDoubleArray(testArray) == 45)
            System.out.println("Test of sum of all numbers in the two dimensional array - OK");
        else System.out.println("Test of sum of all numbers in the two dimensional array - FAIL");
    }
}
