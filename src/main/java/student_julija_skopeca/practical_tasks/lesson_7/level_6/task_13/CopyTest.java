package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.Test1();
        test.Test2();
        test.Test3();
        test.Test4();
        test.Test5();
        test.Test6();
    }

    public void Test1() {
        Copy copy = new Copy();
        int[] in = {0,1,2,3,4,5};
        int[] result = copy.copyInRange(in,1,3);
        int[] resultToCompare = {1, 2, 3};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test1 - ok");
        } else {
            System.out.println("Test1 - fail");
        }
    }

    public void Test2() {
        Copy copy = new Copy();
        int[] in = {2,3,4,5};
        int[] result = copy.copyInRange(in,1,3);
        int[] resultToCompare = {2, 3};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test2 - ok");
        } else {
            System.out.println("Test2 - fail");
        }
    }

    public void Test3() {
        Copy copy = new Copy();
        int[] in = {2,3,4,5};
        int[] result = copy.copyInRange(in,5,10);
        int[] resultToCompare = {5};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test3 - ok");
        } else {
            System.out.println("Test3 - fail");
        }
    }

    public void Test4() {
        Copy copy = new Copy();
        int[] in = {2,3,4,5};
        int[] result = copy.copyInRange(in,7,10);
        int[] resultToCompare = {};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test4 - ok");
        } else {
            System.out.println("Test4 - fail");
        }
    }

    public void Test5() {
        Copy copy = new Copy();
        int[] in = {-3, -2, -1, 0, 2, 3, 4, 5};
        int[] result = copy.copyInRange(in,-2,3);
        int[] resultToCompare = {-2,-1,0,2,3};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test5 - ok");
        } else {
            System.out.println("Test5 - fail");
        }
    }

    public void Test6() {
        Copy copy = new Copy();
        int[] in = {23, 18, 1, 6, 2, 53, 44, 75};
        int[] result = copy.copyInRange(in,5,6);
        int[] resultToCompare = {6};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("Test6 - ok");
        } else {
            System.out.println("Test6 - fail");
        }
    }

}
