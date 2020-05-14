package student_vadims_vladisevs.lesson3.day_6.task_24;

class Phone {

    private String model;
    private boolean isOn;
    private int price;

    public Phone(String model, boolean isOn, int price){
        this.model = model;
        this.isOn = isOn;
        this.price = price;
    }

    public void aboutPhone(){
        System.out.println("Phone model: " + model);
        System.out.println("Is phone on: " + isOn);
        System.out.println("Phone price: " + price);
    }

    public void switchOn(){
        this.isOn = true;
    }
}
