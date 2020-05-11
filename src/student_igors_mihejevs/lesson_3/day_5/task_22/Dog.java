package student_igors_mihejevs.lesson_3.day_5.task_22;

public class Dog {

    private String name, color;
    private int age;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("My name is " + this.name + ", my color is " + this.color +
                " and I'm " + this.age + " years old");
    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

}
