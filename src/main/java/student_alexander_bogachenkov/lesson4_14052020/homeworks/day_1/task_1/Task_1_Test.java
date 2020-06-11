package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_1.task_1;

class Task_1_Test {
    public static void main(String[] args) {
        testForPos();
        testForNeg();
        testForZero();
    }

    public static void testForPos() {
        Task_1 task_1 = new Task_1();

        int userNumber = 21;
        String actualResult = task_1.posOrNeg(userNumber);
        String expectedResult = "Your number is POSITIVE";

        if (actualResult.equals(expectedResult)) {
            System.out.println("TestFopPos PASSED");
        } else {
            System.out.println("TestFopPos FAILED");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public static void testForNeg() {
        Task_1 task_1 = new Task_1();

        int userNumber = -34;
        String actualResult = task_1.posOrNeg(userNumber);
        String expectedResult = "Your number is NEGATIVE";

        if (actualResult.equals(expectedResult)) {
            System.out.println("TestFopNeg PASSED");
        } else {
            System.out.println("TestFopNeg FAILED");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public static void testForZero() {
        Task_1 task_1 = new Task_1();

        int userNumber = 0;
        String actualResult = task_1.posOrNeg(userNumber);
        String expectedResult = "Your number is ZERO";

        if (actualResult.equals(expectedResult)) {
            System.out.println("TestFopZERO PASSED");
        } else {
            System.out.println("TestFopZERO FAILED");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }
}
