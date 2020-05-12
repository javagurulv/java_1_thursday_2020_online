package student_vadims_vladisevs.lesson3.day_6.task_25;
import java.lang.Math;

class Circle {

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        double area = Math.PI * Math.sqrt(radius);
        return area;
    }
}
