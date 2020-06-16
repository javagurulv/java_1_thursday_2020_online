package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_3.task_13;

class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, int maxSpeed, int yearOfManufacture, int batteryCapacity) {
        super(model, maxSpeed, yearOfManufacture);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start() {
        System.out.println("Аккумулятор включен!");
    }

    @Override
    void stop() {
        System.out.println("Аккумулятор выключен!");
    }
}
