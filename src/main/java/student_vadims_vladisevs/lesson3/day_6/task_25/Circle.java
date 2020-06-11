package student_vadims_vladisevs.lesson3.day_6.task_25;
import java.lang.Math;

class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.sqrt(radius);
    }
}
