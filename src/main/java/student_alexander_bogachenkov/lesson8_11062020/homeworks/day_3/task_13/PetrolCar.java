package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_3.task_13;

class PetrolCar extends Car {

    private int tankVolume;

    public PetrolCar(String model, int maxSpeed, int yearOfManufacture, int tankVolume) {
        super(model, maxSpeed, yearOfManufacture);
        this.tankVolume = tankVolume;
    }

    @Override
    void start() {
        System.out.println("Двигатель заведен!");
    }

    @Override
    void stop() {
        System.out.println("Двигатель заглушен!");
    }
}
