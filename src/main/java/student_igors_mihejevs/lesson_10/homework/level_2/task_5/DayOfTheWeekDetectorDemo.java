package student_igors_mihejevs.lesson_10.homework.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Please input a valid number between 1 and 7 : ");
        System.out.println(dayOfTheWeekDetector.detectDayName(myInput.nextInt()));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        System.out.println("If Version");
        dayOfTheWeekDetectorIf.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorSwitch =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        System.out.println("Switch Version");
        dayOfTheWeekDetectorSwitch.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorArray =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        System.out.println("Array Version");
        dayOfTheWeekDetectorArray.run();
    }

}
