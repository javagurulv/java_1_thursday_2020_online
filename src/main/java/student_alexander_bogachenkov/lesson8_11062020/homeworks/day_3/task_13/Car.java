package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_3.task_13;

abstract class Car {

    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    abstract void start();

    abstract void stop();
}
