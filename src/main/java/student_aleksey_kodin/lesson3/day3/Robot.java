package student_aleksey_kodin.lesson3.day3;

class Robot {
    private final String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
