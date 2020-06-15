package student_aleksey_kodin.lesson8.level4.task_19;

class Triangle extends Shape {

    private final double baseA;
    private final double baseB;
    private final double baseC;
    private final double height;

    Triangle(double baseA, double baseB,double baseC, double height) {
        super("Triangle");
        this.baseA = baseA;
        this.baseB = baseB;
        this.baseC = baseC;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return Math.round((0.5 * baseA * height));
    }
    @Override
    double calculatePerimeter() {
        return Math.round(baseA + baseB + baseC);
    }
}
