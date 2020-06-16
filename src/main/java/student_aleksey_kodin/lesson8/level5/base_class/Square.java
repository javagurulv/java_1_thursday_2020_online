package student_aleksey_kodin.lesson8.level5.base_class;

public class Square extends Shape {

    private final double base;

    public Square(double base) {
        super("Square");
        this.base = base;
    }
    @Override
    public double calculateArea() {
        return Math.round((base * base));
    }
    @Override
    public double calculatePerimeter() {
        return Math.round((2 * (base + base)));
    }
}
