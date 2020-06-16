package student_vadim_sokolenko.Lesson2;

class Robot {

    private String name;

    public Robot(String robotName){
        this.name = robotName;

    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayName(){
        System.out.println("My name is "+ this.name);    }
}
