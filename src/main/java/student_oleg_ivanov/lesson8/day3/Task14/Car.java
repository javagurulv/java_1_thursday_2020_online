package student_oleg_ivanov.lesson8.day3.Task14;

public abstract class Car {

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
