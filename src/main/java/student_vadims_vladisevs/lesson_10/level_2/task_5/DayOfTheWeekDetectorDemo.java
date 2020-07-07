package student_vadims_vladisevs.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo{

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){

        System.out.println("Please enter day of the week : ");
        Scanner scr = new Scanner(System.in);
        int dayNumberFromUser = scr.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(dayNumberFromUser));

    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoIfVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemoIfVersion.run();
        System.out.println("Day detected by DetectorIfVersion!");
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoSwitchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemoSwitchVersion.run();
        System.out.println("Day detected by DetectorSwitchVersion!");
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoArrayVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorDemoArrayVersion.run();
        System.out.println("Day detected by DetectorArrayVersion!");

    }
}
