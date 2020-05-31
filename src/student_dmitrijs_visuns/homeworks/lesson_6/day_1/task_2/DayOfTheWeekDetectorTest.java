package student_dmitrijs_visuns.homeworks.lesson_6.day_1.task_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest newTest = new DayOfTheWeekDetectorTest();
        newTest.testForMonday();
        newTest.testForTuesday();
        newTest.testForWednesday();
        newTest.testForThursday();
        newTest.testForFriday();
        newTest.testForSaturday();
        newTest.testForSunday();
        newTest.testForNumberLessThanOne();
        newTest.testForNumberMoreThanSeven();

    }


    public void testForMonday() {

        DayOfTheWeekDetector testMonday = new DayOfTheWeekDetector();
        if (testMonday.detectDayName(1).equals("Monday")) {
            System.out.println("Monday detect test - OK");
        } else {
            System.out.println("Monday detect test - FAIL");
        }

    }


    public void testForTuesday() {

        DayOfTheWeekDetector testTuesday = new DayOfTheWeekDetector();
        if (testTuesday.detectDayName(2).equals("Tuesday")) {
            System.out.println("Tuesday detect test - OK");
        } else {
            System.out.println("Tuesday detect test - FAIL");
        }

    }


    public void testForWednesday() {

        DayOfTheWeekDetector testWednesday = new DayOfTheWeekDetector();
        if (testWednesday.detectDayName(3).equals("Wednesday")) {
            System.out.println("Wednesday detect test - OK");
        } else {
            System.out.println("Wednesday detect test - FAIL");
        }

    }

    public void testForThursday() {

        DayOfTheWeekDetector testThursday = new DayOfTheWeekDetector();
        if (testThursday.detectDayName(4).equals("Thursday")) {
            System.out.println("Thursday detect test - OK");
        } else {
            System.out.println("Thursday detect test - FAIL");
        }

    }

    public void testForFriday() {

        DayOfTheWeekDetector testFriday = new DayOfTheWeekDetector();
        if (testFriday.detectDayName(5).equals("Friday")) {
            System.out.println("Friday detect test - OK");
        } else {
            System.out.println("Friday detect test - FAIL");
        }

    }


    public void testForSaturday() {

        DayOfTheWeekDetector testSaturday = new DayOfTheWeekDetector();
        if (testSaturday.detectDayName(6).equals("Saturday")) {
            System.out.println("Saturday detect test - OK");
        } else {
            System.out.println("Saturday detect test - FAIL");
        }

    }

    public void testForSunday() {

        DayOfTheWeekDetector testSunday = new DayOfTheWeekDetector();
        if (testSunday.detectDayName(7).equals("Sunday")) {
            System.out.println("Sunday detect test - OK");
        } else {
            System.out.println("Sunday detect test - FAIL");
        }

    }

    public void testForNumberLessThanOne() {

        DayOfTheWeekDetector testForNumberLessThanOne = new DayOfTheWeekDetector();
        if (testForNumberLessThanOne.detectDayName(0).equals("Invalid day of the week number")) {
            System.out.println("Test for number less than 1 - OK");
        } else {
            System.out.println("Test for number less than 1 - FAIL");
        }

    }


    public void testForNumberMoreThanSeven() {

        DayOfTheWeekDetector testForNumberMoreThanSeven = new DayOfTheWeekDetector();
        if (testForNumberMoreThanSeven.detectDayName(8).equals("Invalid day of the week number")) {
            System.out.println("Test for number more than 7 - OK");
        } else {
            System.out.println("Test for number more than 7 - FAIL");
        }

    }




}
