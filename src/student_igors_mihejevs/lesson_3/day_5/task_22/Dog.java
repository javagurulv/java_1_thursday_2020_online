package student_igors_mihejevs.lesson_3.day_5.task_22;

public class Dog {

    private String name, color;
    private int age;

    public void dogName(String dogName) {
        this.name = dogName;
    }

    public void dogAge(int dogAge) {
        this.age = dogAge;
    }

    public void dogColor(String dogColor) {
        this.color = dogColor;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }

    public void voice() {
        System.out.println("Dog name - " + this.name + "\nDog age - " + this.age + " years" + "\ndog color - " + this.color);
    }

}
