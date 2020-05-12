package student_diana_miranovica.lesson3.homeworks.day_5.task_21;

 class Dog {
    private final String name;
    private final int age;
    private final String color;
    public Dog(String dogName, int dogAge, String dogColor){
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }
    public void voice() {
        System.out.println("Dog's name is " + this.name);
        System.out.println("Dog's age is " + this.age + " years");
        System.out.println("Dog's color is " + this.color);
    }
}
