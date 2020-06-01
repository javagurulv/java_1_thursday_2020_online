package student_vadims_vladisevs.lesson6.day_1.task_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest temp = new DayOfTheWeekDetectorTest();
        temp.testMonday();
        temp.testTuesday();
        temp.testWednesday();
        temp.testThursday();
        temp.testFriday();
        temp.testSaturday();
        temp.testSunday();
        temp.testNumberOutOfBound();


    }

    public void testNumberOutOfBound(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(8);
        printTestResult("Please input a valid number between 1 and 7", result);
    }


    public void testSunday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(7);
        printTestResult("Sunday", result);
    }

    public void testSaturday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(6);
        printTestResult("Saturday", result);
    }


    public void testFriday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(5);
        printTestResult("Friday", result);
    }

    public void testThursday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(4);
        printTestResult("Thursday", result);
    }

    public void testWednesday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(3);
        printTestResult("Wednesday", result);
    }

    public void testTuesday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(2);
        printTestResult("Tuesday", result);
    }


    public void testMonday(){
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String result = test.detectDayName(1);
        printTestResult("Monday", result);
    }



    public void printTestResult(String expectedResult, String result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result.equals(expectedResult)) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }
}
