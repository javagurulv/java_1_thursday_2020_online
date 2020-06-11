package student_aleksey_kodin.lesson3.day5.task_21;

class Dog {
    private int age;
    private final String name;
    private final String color;

    public Dog(String name, int age,String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    void voice() {
        System.out.println("Dog name is - " + name + ". Dog age is " + age +
                            " years old." + " Color is - " + color + ".");
    }

    public void happyBirthday() {
        age++;
    }
}
