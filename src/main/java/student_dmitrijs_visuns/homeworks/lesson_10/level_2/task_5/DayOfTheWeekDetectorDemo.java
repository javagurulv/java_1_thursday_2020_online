package student_dmitrijs_visuns.homeworks.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;


    DayOfTheWeekDetectorDemo (DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public void run(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int inputNumber = sc.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(inputNumber));

    }

    public static void main(String[] args) {
        DayOfTheWeekDetector arrayDetectVersion = new DayOfTheWeekDetectorArrayVersion();
        DayOfTheWeekDetectorDemo arrayDemo = new DayOfTheWeekDetectorDemo(arrayDetectVersion);
        System.out.println("Now using ARRAY version for detecting day of the week");
        arrayDemo.run();
        System.out.println("");

        DayOfTheWeekDetector switchDetectVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo switchDemo = new DayOfTheWeekDetectorDemo(switchDetectVersion);
        System.out.println("Now using SWITCH version for detecting day of the week");
        switchDemo.run();
        System.out.println("");

        DayOfTheWeekDetector ifDetectVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo ifDemo = new DayOfTheWeekDetectorDemo(ifDetectVersion);
        System.out.println("Now using IF version for detecting day of the week");
        ifDemo.run();
        System.out.println("");


    }


}
