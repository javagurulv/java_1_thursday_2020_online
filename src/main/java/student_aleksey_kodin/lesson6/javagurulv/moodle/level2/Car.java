package student_aleksey_kodin.lesson6.javagurulv.moodle.level2;

import java.util.Objects;

class Car {
    private final String model;
    private final String color;
    private final int maxSpeed;
    private int currentSpeed = 0;

    public Car(String model,String color,int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void accelerate(int targetSpeed) {
        if (currentSpeed < targetSpeed) {
            for (int count = currentSpeed; count < targetSpeed; count++) {
                currentSpeed++;
                if (currentSpeed == maxSpeed) break;
            }
        }
    }
    public void decelerate(int targetSpeed) {
        if (currentSpeed > targetSpeed && targetSpeed >= 0) {
            for (int count = currentSpeed; count > targetSpeed; count--) {
                currentSpeed--;
            }
        }
    }
    public boolean isDriving() { return currentSpeed > 0; }
    public boolean isStopped() { return currentSpeed == 0; }
    public boolean canAccelerate() { return currentSpeed < maxSpeed; }
    public boolean canDecelerate() { return currentSpeed > 0;}

    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getMaxSpeed() { return maxSpeed; }
    public int getCurrentSpeed() { return currentSpeed; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
                model.equals(car.model) &&
                color.equals(car.color);
    }
     @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }
}
