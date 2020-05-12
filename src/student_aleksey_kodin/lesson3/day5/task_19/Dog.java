package student_aleksey_kodin.lesson3.day5.task_19;

class Dog {
    private final int age;
    private final String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    void voice() {
        System.out.print("Dog name is - " + name + ". Dog age is " + age + " years old.");
    }
}
