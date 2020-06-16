package student_aleksey_kodin.lesson8.level4.task_17;

public class Square extends Shape {

    private final double base;

    public Square(double base) {
        super("Square");
        this.base = base;
    }
    @Override
    double calculateArea() {
        return Math.round((base * base));
    }
    @Override
    double calculatePerimeter() {
        return Math.round((2 * (base + base)));
    }
}
