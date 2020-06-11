package student_julija_skopeca.practical_tasks.lesson_3.day_3;

 class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        String name1 = robot1.getName();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
