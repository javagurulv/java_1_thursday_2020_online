package student_igors_mihejevs.lesson_10.homework.level_2.task_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        DayOfTheWeekDetectorDemo detectorIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        System.out.println("If Version");
        detectorIf.run();

        DayOfTheWeekDetectorDemo detectorSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        System.out.println("Switch Version");
        detectorSwitch.run();

        DayOfTheWeekDetectorDemo detectorArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        System.out.println("Array Version");
        detectorArray.run();
    }

}
