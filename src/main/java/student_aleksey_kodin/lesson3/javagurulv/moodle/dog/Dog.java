package student_aleksey_kodin.lesson3.javagurulv.moodle.dog;

class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    void voice() {
        System.out.print(" can say.");
    }
    void eat() {
        System.out.print(" can eat.");
    }
    void sleep() {
        System.out.print(" can sleep.");
    }
}
