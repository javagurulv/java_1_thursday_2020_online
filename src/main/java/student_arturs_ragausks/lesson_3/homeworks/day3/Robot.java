package student_arturs_ragausks.lesson_3.homeworks.day3;

class Robot {
    private String name;

    public Robot(String robotName){
        this.name = robotName;
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void sayName(){
        System.out.println("My name is" + this.name);
    }
}
