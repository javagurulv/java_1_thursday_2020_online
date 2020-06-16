package student_aleksey_kodin.lesson8.level5.base_class;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return Math.round((width * height));
    }
    @Override
    public double calculatePerimeter() {
        return Math.round((2 * width) + (2 * height));
    }
}
