package student_oleg_ivanov.lesson8.Day4.Task15;

class Rectangle extends Shape {
    private double length1;
    private double length2;

    Rectangle(double length1, double length2) {
        super("Rectangle");
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    double calculateArea() {
        return (length1 * length2);
    }

    @Override
    double calculatePerimeter() {
        return ((length1 * 2) + (length2 *2));
    }
}
