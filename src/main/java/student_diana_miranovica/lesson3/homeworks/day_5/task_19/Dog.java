package student_diana_miranovica.lesson3.homeworks.day_5.task_19;

 class Dog {
    private final String name;
    private final int age;
    public Dog(String dogName, int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }
    public void voice(){
        System.out.println("Dog's name is "+this.name );
        System.out.println("Dog's age is "+ this.age +" years");
    }

}
