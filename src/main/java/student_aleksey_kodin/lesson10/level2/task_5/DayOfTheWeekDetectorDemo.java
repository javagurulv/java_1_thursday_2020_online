package student_aleksey_kodin.lesson10.level2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    private void run() {
        System.out.println("Please enter numbers 0 and 6:");
        int input = new Scanner(System.in).nextInt();

        String result = dayOfTheWeekDetector.detectDayName(input);
        System.out.println("Use " + dayOfTheWeekDetector.getClass().getSimpleName() + " Input:" + input + " Result:" + result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorIf.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorSwitch.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorArray.run();
    }
}
