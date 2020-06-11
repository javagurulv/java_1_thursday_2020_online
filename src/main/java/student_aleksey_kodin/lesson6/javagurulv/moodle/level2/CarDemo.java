package student_aleksey_kodin.lesson6.javagurulv.moodle.level2;

class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Volvo S80","black",240);

            System.out.println("Our car is " + car.getModel() + " and color is " + car.getColor());
            if (car.isStopped()) System.out.println("Car is stopped");
            if (car.canAccelerate()) System.out.println("Car can accelerate");
            if (!car.canDecelerate()) System.out.println("Car can't decelerate. Car stop. Current speed - " + car.getCurrentSpeed());
            System.out.println("Set speed - 239");
            car.accelerate(239);
            System.out.println("Car current speed is - " + car.getCurrentSpeed());
            System.out.println("Check max speed - set speed 250 but car speed must be only " + car.getMaxSpeed());
            car.accelerate(250);
            System.out.println("Car current speed is - " + car.getCurrentSpeed());
            if (car.isDriving()) System.out.println("Car go with speed " + car.getCurrentSpeed());
            if (car.canDecelerate()) System.out.println("Car can decelerate");
            System.out.println("Check brakes - set speed 0");
            car.decelerate(0);
            System.out.println("Car current speed is - " + car.getCurrentSpeed());
            if (car.isStopped()) System.out.println("Car is stopped");
    }
}
