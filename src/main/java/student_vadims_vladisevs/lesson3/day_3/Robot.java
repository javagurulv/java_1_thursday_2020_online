package student_vadims_vladisevs.lesson3.day_3;

class Robot {

    private String name;

    public Robot(String robotName){
        this.name = robotName;
    }

    public void sayHello(){
        System.out.println("Hello! ");
    }

    public Robot(){
    }

    public void sayYourName(){
        System.out.println("My name is " + name + "!");
    }

}
