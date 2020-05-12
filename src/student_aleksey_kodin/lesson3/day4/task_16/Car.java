package student_aleksey_kodin.lesson3.day4.task_16;
/* Найти ошибку в коде.
   Исправить и запустить программу. */

class Car {
    private final String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
