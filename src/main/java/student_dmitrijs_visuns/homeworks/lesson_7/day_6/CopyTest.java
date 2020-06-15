package student_dmitrijs_visuns.homeworks.lesson_7.day_6;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {
        CopyTest newTest = new CopyTest();
        newTest.copyArrayInRangeTest();
        newTest.leftBoundTest();
        newTest.rightBoundTest();
        newTest.outOfBoundsTest();
    }

    public void copyArrayInRangeTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 15, 45);
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
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
        if (Arrays.equals(expected, out)) {
            System.out.println("Left bound value test - out of array bounds - OK");
        } else {
            System.out.println("Left bound value test - out of array bounds - FAIL");
        }
    }

    public void rightBoundTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 43, 88);
        int[] expected = {50, 60};
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
        if (Arrays.equals(expected, out)) {
            System.out.println("Right bound value test - out of array bounds - OK");
        } else {
            System.out.println("Right bound value test - out of array bounds - FAIL");
        }
    }


    public void outOfBoundsTest () {
        Copy copy = new Copy();
        int[] in = {10, 20, 30, 40, 50, 60};
        int[] out = copy.copyInRange(in, 3, 8);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

        if (out.length == 0) {
            System.out.println("Out of bounds test - OK");
        } else {
            System.out.println("Out of bounds test - FAIL");
        }
    }


}
