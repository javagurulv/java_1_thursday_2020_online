package student_diana_miranovica.lesson3.homeworks.day_5.task_22;

 class Dog {
    private final String name;
    private final int age;
    private String color;

    public Dog(String dogName, int dogAge, String dogColor){
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("Dog's name is " + name);
        System.out.println("Dog's age is " + age + " years");
        System.out.println("Dog's color is " + color);
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
