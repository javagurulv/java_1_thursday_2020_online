package student_vadims_vladisevs.lesson3.day_6.task_24;

class Human {

    private String name;
    private int age;
    private boolean isTired;

    public Human(String name, int age, boolean isTired){
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }

    public void aboutHuman(){
        System.out.println("Human name: " + name);
        System.out.println("Human age: " + age);
        System.out.println("Is human tired: " + isTired);
    }

    public void work(){
        isTired = true;
    }

}
