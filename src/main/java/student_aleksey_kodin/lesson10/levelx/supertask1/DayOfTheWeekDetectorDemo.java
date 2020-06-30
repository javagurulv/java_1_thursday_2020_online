package student_aleksey_kodin.lesson10.levelx.supertask1;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector strategy;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector strategy) {
        this.strategy = strategy;
    }

    private void run() {
        System.out.println("Please enter numbers 0 and 6:");
        int input = new Scanner(System.in).nextInt();

        String result = strategy.detectDayName(input);

        String className = strategy.getClass().getSimpleName();
        System.out.println("Use " + className + ": Input:" + input + " Result:" + result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo useSwitch = new DayOfTheWeekDetectorDemo(new SwitchStrategy());
        useSwitch.run();
        DayOfTheWeekDetectorDemo useIf = new DayOfTheWeekDetectorDemo(new IfStrategy());
        useIf.run();
        DayOfTheWeekDetectorDemo useArray = new DayOfTheWeekDetectorDemo(new ArrayStrategy());
        useArray.run();
    }
}
