package student_diana_miranovica.lesson_8.lesone_code;

public class PetrolCar extends Car{

    public PetrolCar(String model){
        super(model);
    }


    @Override
    public void start() {
        System.out.println("Start Petrol Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Petrol Engine");
    }


}
