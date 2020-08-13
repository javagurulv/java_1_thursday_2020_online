package student_julija_skopeca.practical_tasks.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number form 1 to 7");
        int number = sc.nextInt();
        String result = dayOfTheWeekDetector.detectDayName(number);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorIf.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorSwitch.run();
    }

}
