package student_oleg_ivanov.lesson8.Day4.Task15;

class Triangle extends Shape {
    private double length1;
    private double length2;
    private double length3;
    private double lengthHeight;

    Triangle(double length1, double length2, double length3, double lengthHeight) {
        super("Triangle");
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.lengthHeight = lengthHeight;

    }

    @Override
    double calculateArea() {
        return ((lengthHeight * length1) / 2);
    }

    @Override
    double calculatePerimeter() {
        return (length1 + length2 + length3);
    }
}
