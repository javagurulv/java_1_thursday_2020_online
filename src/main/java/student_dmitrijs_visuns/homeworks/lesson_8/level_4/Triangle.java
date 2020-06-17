package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle (double sideA, double sideB, double sideC) {
        super("triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double heightOfSideA = (2 * (Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)))) / sideA;
        return (sideA * heightOfSideA) / 2;

    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
