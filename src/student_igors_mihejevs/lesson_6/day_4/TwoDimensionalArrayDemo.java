package student_igors_mihejevs.lesson_6.day_4;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray testArray = new TwoDimensionalArray();

        int[][] doubleArray = testArray.createDoubleArray(3, 3);
        testArray.fillArrayWithRandomNumbers(doubleArray);
        testArray.printDoubleArrayToConsole(doubleArray);
        System.out.println("Sum of all numbers = " + testArray.sumOfAllNumbersFromDoubleArray(doubleArray));
    }

}
