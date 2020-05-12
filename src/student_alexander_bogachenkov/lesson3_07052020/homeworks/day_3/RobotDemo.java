package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider" + "!");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John" + "!");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Verter" + "!");
        robot3.sayHello();
        robot3.sayYourName();
    }
}
