package student_diana_miranovica.lesson_8.home_works.day_3.task_14;

public abstract class Car {

    abstract void accelerate();

    public Car() {
    }
}
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {

    }


}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}
