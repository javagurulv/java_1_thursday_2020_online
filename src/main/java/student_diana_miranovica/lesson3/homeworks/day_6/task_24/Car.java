package student_diana_miranovica.lesson3.homeworks.day_6.task_24;


class Car {
    private final String model;
    private final int maxSpeed;
    private final String color;

    public Car(String model, int maxSpeed, String carColor){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = carColor;
    }

    public void voice() {
        System.out.println("Car model - " + model);
        System.out.println("Car maximum speed -  " + maxSpeed + " km/h");
        System.out.println("Car color - " + color);
    }


}

