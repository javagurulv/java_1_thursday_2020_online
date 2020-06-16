package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {
        CopyTest newTest = new CopyTest();
        newTest.copyArrayInRangeTest();
        newTest.leftBoundTest();
        newTest.rightBoundTest();
        newTest.outOfBoundsTest();
        newTest.arrayLengthTest();
    }

    public void copyArrayInRangeTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 20, 40);
        int[] expected = {20, 30, 40};

       if (Arrays.equals(expected, out)) {
            System.out.println("Copy array with specified bounds test - OK");
        } else {
            System.out.println("Copy array with specified bounds test - FAIL");
        }
    }

    public void leftBoundTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 3, 23);
        int[] expected = {10, 20};

        if (Arrays.equals(expected, out)) {
            System.out.println("Left bound value test - out of array value - OK");
        } else {
            System.out.println("Left bound value test - out of array value - FAIL");
        }
    }

    public void rightBoundTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 43, 88);
        int[] expected = {50, 60};

        if (Arrays.equals(expected, out)) {
            System.out.println("Right bound value test - out of array value - OK");
        } else {
            System.out.println("Right bound value test - out of array value - FAIL");
        }
    }


    public void outOfBoundsTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 3, 8);
        int emptyArrayLength = 0;

        if (out.length == emptyArrayLength) {
            System.out.println("Out of bounds value test - OK");
        } else {
            System.out.println("Out of bounds value test - FAIL");
        }
    }

    public void arrayLengthTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 40, 100);
        int expectedArrayLength = 3;

        if (out.length == expectedArrayLength) {
            System.out.println("Array length test - OK");
        } else {
            System.out.println("Array length test - FAIL");
        }
    }


}
