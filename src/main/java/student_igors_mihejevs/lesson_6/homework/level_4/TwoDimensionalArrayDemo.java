package student_igors_mihejevs.lesson_6.homework.level_4;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray testArray = new TwoDimensionalArray();

        int[][] doubleArray = testArray.createDoubleArray(3, 3);
        testArray.fillArrayWithRandomNumbers(doubleArray);
        testArray.printDoubleArrayToConsole(doubleArray);
        System.out.println("Sum of all numbers = " + testArray.sumOfAllNumbersFromDoubleArray(doubleArray));
    }

}
