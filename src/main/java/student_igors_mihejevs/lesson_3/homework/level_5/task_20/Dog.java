package student_igors_mihejevs.lesson_3.homework.level_5.task_20;

class Dog {

    private final String name;
    private int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

    public void happyBirthday() {
        age++;
    }

}
