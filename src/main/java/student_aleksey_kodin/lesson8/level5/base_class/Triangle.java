package student_aleksey_kodin.lesson8.level5.base_class;

public class Triangle extends Shape {

    private final double baseA;
    private final double baseB;
    private final double baseC;
    private final double height;

    public Triangle(double baseA, double baseB, double baseC, double height) {
        super("Triangle");
        this.baseA = baseA;
        this.baseB = baseB;
        this.baseC = baseC;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return Math.round((0.5 * baseA * height));
    }
    @Override
    public double calculatePerimeter() {
        return Math.round(baseA + baseB + baseC);
    }
}
