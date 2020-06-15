package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_1.task_2;

import java.time.temporal.Temporal;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnErrorMessage();
    }

    public void shouldReturnMonday() {
        String expectedResult = "Monday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(1);

        // Try to extract this common part to separate method!
        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnMonday PASSED");
        } else {
            System.out.println("shouldReturnMonday FAILED");
        }
    }

    public void shouldReturnTuesday() {
        String expectedResult = "Tuesday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(2);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnTuesday PASSED");
        } else {
            System.out.println("shouldReturnTuesday FAILED");
        }
    }

    public void shouldReturnWednesday() {
        String expectedResult = "Wednesday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(3);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnWednesday PASSED");
        } else {
            System.out.println("shouldReturnWednesday FAILED");
        }
    }

    public void shouldReturnThursday() {
        String expectedResult = "Thursday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(4);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnThursday PASSED");
        } else {
            System.out.println("shouldReturnThursday FAILED");
        }
    }

    public void shouldReturnFriday() {
        String expectedResult = "Friday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(5);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnFriday PASSED");
        } else {
            System.out.println("shouldReturnFriday FAILED");
        }
    }

    public void shouldReturnSaturday() {
        String expectedResult = "Saturday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(6);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnSaturday PASSED");
        } else {
            System.out.println("shouldReturnSaturday FAILED");
        }
    }

    public void shouldReturnSunday() {
        String expectedResult = "Sunday";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(7);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnSunday PASSED");
        } else {
            System.out.println("shouldReturnSunday FAILED");
        }
    }

    public void shouldReturnErrorMessage() {
        String expectedResult = "Please input a valid number between 1 and 7";
        DayOfTheWeekDetector victim = new DayOfTheWeekDetector();
        String actualResult = victim.detectDayName(30);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnErrorMessage PASSED");
        } else {
            System.out.println("shouldReturnErrorMessage FAILED");
        }
    }
}
