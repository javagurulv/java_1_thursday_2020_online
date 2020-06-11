package student_aleksey_kodin.lesson6.day1.task_2;

class DayOfTheWeekDetectorTest {
    private final DayOfTheWeekDetector dayOfTheWeekDetector= new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.testValueMonday();
        dayOfTheWeekDetectorTest.testValueTuesday();
        dayOfTheWeekDetectorTest.testValueWednesday();
        dayOfTheWeekDetectorTest.testValueThursday();
        dayOfTheWeekDetectorTest.testValueFriday();
        dayOfTheWeekDetectorTest.testValueSaturday();
        dayOfTheWeekDetectorTest.testValueSunday();
        dayOfTheWeekDetectorTest.testValueNoDay();

    }
    public void testValueMonday() {
        String result = dayOfTheWeekDetector.detectDayName(1);
        printTestResult(result.equals("Monday"),"Monday");
    }
    public void testValueTuesday() {
        String result = dayOfTheWeekDetector.detectDayName(2);
        printTestResult(result.equals("Tuesday"),"Tuesday");
    }
    public void testValueWednesday() {
        String result = dayOfTheWeekDetector.detectDayName(3);
        printTestResult(result.equals("Wednesday"),"Wednesday");
    }
    public void testValueThursday() {
        String result = dayOfTheWeekDetector.detectDayName(4);
        printTestResult(result.equals("Thursday"),"Thursday");
    }
    public void testValueFriday() {
        String result = dayOfTheWeekDetector.detectDayName(5);
        printTestResult(result.equals("Friday"),"Friday");
    }
    public void testValueSaturday() {
        String result = dayOfTheWeekDetector.detectDayName(6);
        printTestResult(result.equals("Saturday"),"Saturday");
    }
    public void testValueSunday() {
        String result = dayOfTheWeekDetector.detectDayName(7);
        printTestResult(result.equals("Sunday"),"Sunday");
    }
    public void testValueNoDay() {
        String result = dayOfTheWeekDetector.detectDayName(10);
        printTestResult(result.equals("Please input a valid number between 1 and 7"),
                                        "Please input a valid number between 1 and 7");
    }
    private void printTestResult(boolean isResultOk,String dayOfWeek) {
        if (isResultOk) {
            System.out.println("DayOfTheWeekDetector test - " + dayOfWeek + " = OK");
        } else {
            System.out.println("DayOfTheWeekDetector test - " + dayOfWeek + " = FAIL");
        }
    }
}
