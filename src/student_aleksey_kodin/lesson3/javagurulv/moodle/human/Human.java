package student_aleksey_kodin.lesson3.javagurulv.moodle.human;

class Human {
    private final String name;
    private final int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
