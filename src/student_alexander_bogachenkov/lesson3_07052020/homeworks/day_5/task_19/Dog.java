package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_5.task_19;

class Dog {

    private final String nickname;
    private final int age;

    public Dog(String dogNickname, int dogAge) {
        this.nickname = dogNickname;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.nickname);
        System.out.println(this.age);
    }
}
