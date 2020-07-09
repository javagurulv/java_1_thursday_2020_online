package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detectorIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detectorIf.run();
        DayOfTheWeekDetectorDemo detectorSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detectorSwitch.run();
        DayOfTheWeekDetectorDemo detectorArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        detectorArray.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number in the range from 1 to 7 to detect day of the week: ");
        int number = scanner.nextInt();
        String result = this.detector.detectDayName(number);
        System.out.println(result);
    }

}
