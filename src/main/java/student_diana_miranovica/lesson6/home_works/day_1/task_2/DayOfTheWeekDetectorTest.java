package student_diana_miranovica.lesson6.home_works.day_1.task_2;

 class DayOfTheWeekDetectorTest {
    private final DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

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
    private void printTestResult(boolean isResultOk,String daysOfWeek) {
        if (isResultOk) {
            System.out.println("DayOfTheWeekDetector test - " + daysOfWeek + " = OK");
        } else {
            System.out.println("DayOfTheWeekDetector test - " + daysOfWeek + " = FAIL");
        }
    }
    public void testMonday(){
        String result = dayOfTheWeekDetector.detectDayName(1);
        printTestResult(result.equals("Monday"),"Monday");
    }
    public void testTuesday(){
        String result = dayOfTheWeekDetector.detectDayName(2);
        printTestResult(result.equals("Tuesday"),"Tuesday");
    }
    public void testWednesday(){
        String result = dayOfTheWeekDetector.detectDayName(3);
        printTestResult(result.equals("Wednesday"),"Wednesday");
    }
    public void testThursday(){
        String result = dayOfTheWeekDetector.detectDayName(4);
        printTestResult(result.equals("Thursday"),"Thursday");
    }
    public void testFriday(){
        String result = dayOfTheWeekDetector.detectDayName(5);
        printTestResult(result.equals("Friday"),"Friday");
    }
    public void testSaturday(){
        String result = dayOfTheWeekDetector.detectDayName(6);
        printTestResult(result.equals("Saturday"),"Saturday");
    }
    public void testSunday(){
        String result = dayOfTheWeekDetector.detectDayName(7);
        printTestResult(result.equals("Sunday"),"Sunday");
    }


}
