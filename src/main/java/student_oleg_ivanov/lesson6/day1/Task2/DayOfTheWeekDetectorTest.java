package student_oleg_ivanov.lesson6.day1.Task2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.testMonday();
        dayOfTheWeekDetectorTest.testTuesday();
        dayOfTheWeekDetectorTest.testWednesday();
        dayOfTheWeekDetectorTest.testThursday();
        dayOfTheWeekDetectorTest.testFriday();
        dayOfTheWeekDetectorTest.testSaturday();
        dayOfTheWeekDetectorTest.testSunday();

    }
    public void testMonday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(1);
        printTestResult("Monday", result);
    }
    public void testTuesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(2);
        printTestResult("Tuesday", result);
    }
    public void testWednesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(3);
        printTestResult("Wednesday", result);
    }
    public void testThursday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(4);
        printTestResult("Thursday", result);
    }
    public void testFriday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(5);
        printTestResult("Friday", result);
    }
    public void testSaturday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(6);
        printTestResult("Saturday", result);
    }
    public void testSunday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(7);
        printTestResult("Sunday", result);
    }

    private void printTestResult(String expectedResult, String result) {
        if (result.equals(expectedResult)) {
            System.out.println("DayOfTheWeekDetector test = " + expectedResult + " OK");
        } else {
            System.out.println("DayOfTheWeekDetector test = " + result + " Fail");
        }
    }


}
