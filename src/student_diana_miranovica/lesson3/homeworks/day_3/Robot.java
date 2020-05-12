package student_diana_miranovica.lesson3.homeworks.day_3;

 class Robot {
    private final String name;

    public Robot(String robotName){
        this.name = robotName;

    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayName(){
        System.out.println("My name is "+ this.name);    }
}
