package student_diana_miranovica.lesson_8.lesone_code;

public class DieselCar extends Car {

    public DieselCar(String model){
        super(model);

    }
    @Override
    public void start() {
        System.out.println("Start Diesel Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Diesel Engine");
    }
}
