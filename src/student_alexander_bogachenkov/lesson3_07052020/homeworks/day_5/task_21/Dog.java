package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_5.task_21;

public class Dog {

    private String nickname;
    private int age;
    private String color;

    public Dog(String dogNickname, int dogAge, String dogColor) {
        this.nickname = dogNickname;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println(this.nickname);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}