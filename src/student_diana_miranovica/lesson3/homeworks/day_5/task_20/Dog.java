package student_diana_miranovica.lesson3.homeworks.day_5.task_20;

 class Dog {
    private final String name;
    private int age;
    public Dog(String dogName, int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }
    public void voice(){
        System.out.println("Dog's name is "+this.name );
        System.out.println("Dog's age is "+ this.age +" years");
    }
    public void happyBirthday(){
       age++;

    }
}
