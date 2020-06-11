package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_5.task_20;

class Dog {

    private final String nickname;
    private int age;

    public Dog(String dogNickname, int dogAge) {
        this.nickname = dogNickname;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.nickname);
        System.out.println(this.age);
    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }
}