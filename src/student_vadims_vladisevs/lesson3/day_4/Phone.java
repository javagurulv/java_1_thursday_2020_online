package student_vadims_vladisevs.lesson3.day_4;

public class Phone {

    private final String model;

    public Phone(String newModel) {    // вместо "Book", нужно назвать конструктор "Phone";
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}
