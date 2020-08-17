package student_igors_mihejevs.lesson_6.homework.level_1;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.test("Monday",1);
        dayOfTheWeekDetectorTest.test("Tuesday",2);
        dayOfTheWeekDetectorTest.test("Wednesday",3);
        dayOfTheWeekDetectorTest.test("Thursday",4);
        dayOfTheWeekDetectorTest.test("Friday",5);
        dayOfTheWeekDetectorTest.test("Saturday",6);
        dayOfTheWeekDetectorTest.test("Sunday",7);
        dayOfTheWeekDetectorTest.test("Please input a valid number between 1 and 7",9);
    }
    void test(String nameOfDay, int numberOfDay) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(numberOfDay);
        if(result.equals(nameOfDay)) {
            System.out.println("DayOfTheWeekDetector test - "+ nameOfDay + " = OK");
        } else {
            System.out.println("DayOfTheWeekDetector test - "+ nameOfDay + " = FAIL");
        }
    }
}
