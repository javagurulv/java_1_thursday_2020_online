package student_vadims_vladisevs.lesson3.day_5.task_19;

public class Dog {

    private final String dogName;
    private final int dogAge;

    public Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice(){
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
    }
}

