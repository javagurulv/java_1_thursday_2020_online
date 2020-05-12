package student_vadims_vladisevs.lesson3.day_5.task_21;

class Dog {

    private final String dogName;
    private final int dogAge;
    private final String dogColor;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice(){
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog color: " + dogColor);
    }
}

