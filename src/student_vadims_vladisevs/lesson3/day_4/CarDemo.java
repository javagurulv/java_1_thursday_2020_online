package student_vadims_vladisevs.lesson3.day_4;

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();           //вместо "myPhone", нужно писать "myCar";
        System.out.println("Car model = " + carModel);
    }

}
