package student_vadims_vladisevs.lesson3.day_5.task_22;

class Dog {

    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void changeColor(String newDogColor){
        this.dogColor = newDogColor;
    }

    public void voice(){
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog color: " + dogColor);
    }
}
