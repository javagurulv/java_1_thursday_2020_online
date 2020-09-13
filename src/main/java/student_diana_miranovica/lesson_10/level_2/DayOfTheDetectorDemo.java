package student_diana_miranovica.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheDetectorDemo {

    DayOfTheWeekDetector detector;


    public DayOfTheDetectorDemo(DayOfTheWeekDetector detector){
        this.detector = detector;
    }


    public static void main(String[] args) {
        DayOfTheDetectorDemo detectorIfVersion = new DayOfTheDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheDetectorDemo detectorSwitchVersion = new DayOfTheDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheDetectorDemo detectorArrayVersion = new DayOfTheDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        detectorArrayVersion.start();
        detectorIfVersion.start();
        detectorSwitchVersion.start();
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input integer number between 1 and 7");
        int number = sc.nextInt();
        String result = this.detector.detectDayName(number);
        System.out.println(result);
    }
}
