package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_3;

class Task_10_Test {

    public static void main(String[] args) {
        Task_10_Test test = new Task_10_Test();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    public void test1() {
        int firstNum = 456;
        int secondNum = 397;
        int thirdNum = 233;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test1 PASSED");
        } else {
            System.out.println("test1 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void test2() {
        int firstNum = 397;
        int secondNum = 456;
        int thirdNum = 233;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test2 PASSED");
        } else {
            System.out.println("test2 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void test3() {
        int firstNum = 397;
        int secondNum = 233;
        int thirdNum = 456;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test3 PASSED");
        } else {
            System.out.println("test3 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void test4() {
        int firstNum = 456;
        int secondNum = 456;
        int thirdNum = 397;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test4 PASSED");
        } else {
            System.out.println("test4 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void test5() {
        int firstNum = 397;
        int secondNum = 456;
        int thirdNum = 456;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test5 PASSED");
        } else {
            System.out.println("test5 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void test6() {
        int firstNum = 456;
        int secondNum = 397;
        int thirdNum = 456;
        int expectedResult = 456;

        Task_10 victim = new Task_10();
        int actualResult = victim.maxNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("test6 PASSED");
        } else {
            System.out.println("test6 FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }
}
