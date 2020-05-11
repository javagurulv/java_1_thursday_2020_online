package student_igors_mihejevs.lesson_3.day_5.task_19;

public class Dog {

    private String name;
    private int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println("My name is " + this.name + " and I'm " + this.age + " years old");
    }

}
