package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_5.task_22;

class Dog {

    private final String name;
    private final int age;
    private String color;

    public void voice() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }

    public Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
