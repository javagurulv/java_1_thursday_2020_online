package student_oleg_ivanov.lesson3.homeworks.day1;

class RobotDemo {
    public static void main(String[] args){
        System.out.print("Terminator1 ");
        Robot terminator1 = new Robot();
        terminator1.sayHello();
        terminator1.sayMyName();


        System.out.println("Terminator2 ");
        Robot terminator2 = new Robot();
        terminator2.sayMyColor();
        terminator2.sayMyWeight();

        System.out.print("Terminator3 ");
        Robot terminator3 = new Robot();
        terminator3.sayHello();
        terminator3.sayMyName();
        terminator3.sayMyWeight();
        terminator3.sayMyColor();
    }
}
