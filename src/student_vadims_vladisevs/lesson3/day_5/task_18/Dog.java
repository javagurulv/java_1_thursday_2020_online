package student_vadims_vladisevs.lesson3.day_5.task_18;

public class Dog {

    private final String dogName;

    public Dog(String dogName){
        this.dogName = dogName;
    }

    public void voice(){
        System.out.println(dogName + " " + dogName + " " + dogName);
    }
}
