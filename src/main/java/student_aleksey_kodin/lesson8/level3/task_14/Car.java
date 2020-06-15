package student_aleksey_kodin.lesson8.level3.task_14;

abstract class Car {

    abstract void accelerate();

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