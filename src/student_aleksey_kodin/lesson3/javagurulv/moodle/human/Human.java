package student_aleksey_kodin.lesson3.javagurulv.moodle.ddd;

public class Human {
    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
