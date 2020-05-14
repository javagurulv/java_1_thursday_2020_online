package student_vadims_vladisevs.lesson3.day_5.task_20;

class Dog {

    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void happyBirthday(){
        this.dogAge = dogAge + 1;
    }
    public void voice(){
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
    }
}

