package student_igors_mihejevs.lesson_3.day_3;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robotROBO = new Robot("ROBO");
        String robot1 = robotROBO.sayYourName();
        System.out.println("Robot1 name is " + robot1);

        Robot robotROBI = new Robot("ROBI");
        String robot2 = robotROBI.sayYourName();
        System.out.println("Robot2 name is " + robot2);

        Robot robotROBIK = new Robot("ROBIK");
        String robot3 = robotROBIK.sayYourName();
        System.out.println("Robot3 name is " + robot3);

    }
}
