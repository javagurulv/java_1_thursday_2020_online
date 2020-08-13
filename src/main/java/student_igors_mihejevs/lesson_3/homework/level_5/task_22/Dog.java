package student_igors_mihejevs.lesson_3.homework.level_5.task_22;

class Dog {

    private final String name;
    private String color;
    private int age;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("My name is " + name + ", my color is " + color +
                " and I'm " + age + " years old");
    }

    public void happyBirthday() {
        age++;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

}
