package student_julija_skopeca.practical_tasks.lesson_10.level_2.task_4;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.Test1MondayIf();
        test.TestIncorrectDayIf();
        test.Test5FridaySwitch();
        test.TestIncorrectDaySwitch();
    }

    public void Test1MondayIf() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetector.detectDayName(1);
        if (result == "Monday") {
            System.out.println("Test1MondayIf test - ok");
        } else {
            System.out.println("Test1MondayIf test - fail");}
    }

    public void TestIncorrectDayIf() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetector.detectDayName(13);
        if (result == "Please input a valid number between 1 and 7") {
            System.out.println("TestIncorrectDayIf test - ok");
        } else {
            System.out.println("TestIncorrectDayIf test - fail");}
    }

    public void Test5FridaySwitch() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetector.detectDayName(5);
        if (result == "Friday") {
            System.out.println("Test5FridaySwitch test - ok");
        } else {
            System.out.println("Test5FridaySwitch test - fail");}
    }

    public void TestIncorrectDaySwitch() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetector.detectDayName(13);
        if (result == "Please input a valid number between 1 and 7") {
            System.out.println("TestIncorrectDaySwitch test - ok");
        } else {
            System.out.println("TestIncorrectDaySwitch test - fail");}
    }

}
