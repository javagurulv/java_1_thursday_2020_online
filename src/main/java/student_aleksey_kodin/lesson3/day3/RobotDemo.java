package student_aleksey_kodin.lesson3.day3;

class RobotDemo {

    public static void main(String[] args) {
        Robot robot = new Robot("Rider");
        robot.sayHello();
        robot.sayYourName();

        Robot robotNewVersion = new Robot("John");
        robotNewVersion.sayHello();
        robotNewVersion.sayYourName();
    }
}
