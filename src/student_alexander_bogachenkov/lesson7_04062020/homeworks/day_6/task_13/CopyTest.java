package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.copyTest1();
        test.copyTest2();
        test.copyTest3();
    }

    public void copyTest1() {
        Copy copy = new Copy();
        int[] expectedArray = {2, 3, 4, 5};
        int[] testArray = {0, 1, 2, 3, 4, 5, 6};
        int[] actualArray = copy.copyInRange(testArray, 2, 5);

        if (Arrays.equals(actualArray, expectedArray)) {
            System.out.println("copyTest1 PASSED");
        } else {
            System.out.println("copyTest1 FAILED");
        }
    }

    public void copyTest2() {
        Copy copy = new Copy();
        int[] expectedArray = {0, 1};
        int[] testArray = {0, 1, 2, 3, 4, 5, 6};
        int[] actualArray = copy.copyInRange(testArray, 0, 1);

        if (Arrays.equals(actualArray, expectedArray)) {
            System.out.println("copyTest2 PASSED");
        } else {
            System.out.println("copyTest2 FAILED");
        }
    }

    public void copyTest3() {
        Copy copy = new Copy();
        int[] expectedArray = {5, 6};
        int[] testArray = {0, 1, 2, 3, 4, 5, 6};
        int[] actualArray = copy.copyInRange(testArray, 5, 6);

        if (Arrays.equals(actualArray, expectedArray)) {
            System.out.println("copyTest3 PASSED");
        } else {
            System.out.println("copyTest3 FAILED");
        }
    }
}
