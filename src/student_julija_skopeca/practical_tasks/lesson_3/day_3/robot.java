package student_julija_skopeca.practical_tasks.lesson_3.day_3;

 class robot {

    private final String name;

    public robot(String robotName){
        this.name = robotName;
    }

    public String getName() {return this.name; }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }
}
