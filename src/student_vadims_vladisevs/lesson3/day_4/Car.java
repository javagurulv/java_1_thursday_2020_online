package student_vadims_vladisevs.lesson3.day_4;

class Car {

    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel(){   // не хватало - "()";
        return this.model;      // не хватало ";" ;
    }

}
