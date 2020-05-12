package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_3;

class Robot {

    private final String name;

    public Robot (String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}