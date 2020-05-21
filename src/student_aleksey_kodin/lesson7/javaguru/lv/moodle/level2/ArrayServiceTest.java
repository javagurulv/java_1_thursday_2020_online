package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level2;

import java.util.Arrays;

class ArrayServiceTest {
    private static int[] array = new int[0];
    private static final int[] emptyArray = new int[0];
    private static final int[] arrayForSort = {4, 7, 2, 3, 8, 9, 5, 1, 6};
    private static final int[] testArrayForSort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int[] arrayForSwap = {1, 3, 8, 5, 4, 7, 9, 6, 2};
    private static final int[] testArrayForSwap = {2, 6, 9, 7, 4, 5, 8, 3, 1};
    private static final ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.testCreateArray(5);
        arrayServiceTest.testFillRandomly(array);
        arrayServiceTest.testSum(array);
        arrayServiceTest.testAvg(array);
        arrayServiceTest.testAvgArrayLengthZero(emptyArray);
        System.out.println("---------------------------------");
        arrayService.printArray(array);
        System.out.println("---------------------------------");
        System.out.println("Sum = " + arrayService.sum(array));
        System.out.println("Avg = " + arrayService.avg(array));
        System.out.println("---------------------------------");
        System.out.println("Array sort:");
        arrayServiceTest.testSort(arrayForSort);
        System.out.println("Array swap:");
        arrayServiceTest.testSwap(arrayForSwap);
    }
    public void testCreateArray(int size) {
        array = arrayService.create(size);
        printTestResult(array.length == size, "Create array");
    }
    public void testFillRandomly(int[] array) {
        arrayService.fillRandomly(array);
        printTestResult(arrayService.sum(array) > 0, "Fill Randomly");
    }
    public void testSum(int[] array) {
        int result = arrayService.sum(array);
        printTestResult(result == array[0] + array[1] + array[2] + array[3] + array[4], "Sum");
    }
    public void testAvg(int[] array) {
        double result = arrayService.avg(array);
        printTestResult(result == (double) (array[0] + array[1] + array[2] + array[3] + array[4]) / 5, "Avg");
    }
    public void testAvgArrayLengthZero(int[] array) {
        double result = arrayService.avg(array);
        printTestResult(result == 0, "Avg return 0 if [Array.length = 0]");
    }
    public void testSort(int[] arrayForSort) {
        System.out.println(Arrays.toString(arrayForSort));
        arrayForSort = arrayService.sort(arrayForSort);
        printTestResult(Arrays.equals(arrayForSort, testArrayForSort), "Sort array");
        System.out.println(Arrays.toString(arrayForSort));
    }
    public void testSwap(int[] arrayForSwap) {
        System.out.println(Arrays.toString(arrayForSwap));
        arrayForSwap = arrayService.swap(arrayForSwap);
        printTestResult(Arrays.equals(arrayForSwap, testArrayForSwap), "Swap array");
        System.out.println(Arrays.toString(arrayForSwap));
    }
    private void printTestResult(boolean isResultOk,String arrayFunction) {
        if (isResultOk) {
            System.out.println("ArrayService test - " + arrayFunction + " = OK");
        } else {
            System.out.println("ArrayService test - " + arrayFunction + " = FAIL");
        }
    }
}
