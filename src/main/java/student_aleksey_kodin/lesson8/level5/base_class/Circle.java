package student_aleksey_kodin.lesson8.level5.base_class;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.round((Math.PI * radius * radius));
    }
    @Override
    public double calculatePerimeter() {
        return Math.round((2 * Math.PI * radius));
    }
}
