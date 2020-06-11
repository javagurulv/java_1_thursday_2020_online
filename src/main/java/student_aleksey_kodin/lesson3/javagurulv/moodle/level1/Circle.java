package student_aleksey_kodin.lesson3.javagurulv.moodle.level1;
import java.lang.Math;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return  radius;
    }
    public double getCircleArea () {
        return calculateArea();
    }
    private double calculateArea() {
        return Math.PI * radius * radius;
    }
}
