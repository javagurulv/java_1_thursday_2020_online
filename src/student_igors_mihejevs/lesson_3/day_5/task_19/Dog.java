package student_igors_mihejevs.lesson_3.day_5.task_19;

public class Dog {

    private String name;
    private int age;

    public void dogName() {
        this.name = "Viking";
    }

    public void dogAge() {
        this.age = 5;
    }

    public void voice() {
        System.out.println("Dog name - " + this.name + "\nDog age - " + this.age + " years");
    }

}
