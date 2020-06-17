package student_dmitrijs_visuns.homeworks.lesson_8.level_3;

/*Исправьте код программы так, что бы он компилировался.
        Класс Car менять нельзя.
        Классы ElectricCar и PetrolCar должны наследоваться
        от класса Car.*/


class Task_14 {

    abstract class Car {

        abstract void accelerate();

    }

    class ElectricCar extends Car {

        private int batteryCharge;
        public void accelerate() {
            System.out.println("Speeding up!");
            batteryCharge--;
        }


    }

    class PetrolCar extends Car {

        private double petrolTankCapacity;
        public void accelerate() {
            System.out.println("Speeding up!");
            petrolTankCapacity--;
        }

    }

}

