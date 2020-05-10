package student_igors_mihejevs.lesson_3.day_5.task_20;

public class Dog {

    private String name;
    private int age;

    public void dogName() {
        this.name = "Viking";
    }

    public void dogAge() {
        this.age = 5;
    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }

    public void voice() {
        System.out.println("Dog name - " + this.name + "\nDog age - " + this.age + " years");
    }

}
