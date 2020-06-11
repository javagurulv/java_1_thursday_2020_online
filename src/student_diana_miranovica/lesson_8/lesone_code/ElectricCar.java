package student_diana_miranovica.lesson_8.lesone_code;

public class ElectricCar extends Car{

    private int bateryCapacy;

    public ElectricCar(String model, int bateryCapacy){

        super(model);
        this.bateryCapacy = bateryCapacy;

    }

    @Override
    public void start() {
        if (this.bateryCapacy > 0) {
            this.bateryCapacy--;
            System.out.println("Accumulator switched ON");
        } else {
            System.out.println("Accumulator is Empty");
        }
    }

    @Override
    public void stop(){
            System.out.println("Accumulator switched OFF");
        }
}
