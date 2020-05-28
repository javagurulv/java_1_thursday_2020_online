package student_alexander_bogachenkov.lesson5_21052020.moodle_lesson_7_homeworks.level_1;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldCreateArray();
        test.shouldFillArrayRandomly();
        test.shouldPrintInfoAboutArray();
        test.shouldSum();
        test.shouldAverage();
    }

    public void shouldCreateArray() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = arrayService.create(5);

        if (testArray.length == 5) {
            System.out.println("shouldCreateArray PASSED");
        } else {
            System.out.println("shouldCreateArray FAILED");
        }
    }

    public void shouldFillArrayRandomly() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = arrayService.create(5);
        Arrays.fill(testArray, -1);
        arrayService.fillRandomly(testArray);

        int sum = 0;
        for (int i = 0; i < testArray.length; i++) {
            sum += testArray[i];
        }

        if (sum > 0) {
            System.out.println("shouldFillArrayRandomly PASSED");
        } else {
            System.out.println("shouldFillArrayRandomly FAILED");
        }
    }

    public void shouldPrintInfoAboutArray() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = arrayService.create(5);
        arrayService.fillRandomly(testArray);
        arrayService.printArray(testArray);
    }

    public void shouldSum() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = arrayService.create(5);
        testArray[0] = 10;
        testArray[1] = 20;
        testArray[2] = 30;
        testArray[3] = 40;
        testArray[4] = 50;
        int expectedSum = 150;
        int actualSum = arrayService.sum(testArray);

        if (actualSum == expectedSum) {
            System.out.println("shouldSum PASSED");
        } else {
            System.out.println("shouldSum FAILED");
        }
    }

    public void shouldAverage() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = arrayService.create(3);
        testArray[0] = 10;
        testArray[1] = 20;
        testArray[2] = 30;
        double expectedAvg = 20.0;
        double actualAvg = arrayService.avg(testArray);

        if (actualAvg == expectedAvg) {
            System.out.println("shouldAverage PASSED");
        } else {
            System.out.println("shouldAverage FAILED");
        }
    }
}
