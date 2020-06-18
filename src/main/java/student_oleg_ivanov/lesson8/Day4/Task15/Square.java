package student_oleg_ivanov.lesson8.Day4.Task15;

class Square extends Shape {

    private double length;

    Square(double length) {
        super("Square");
        this.length = length;

    }

    @Override
    double calculateArea() {
        return (length * length);
    }

    @Override
    double calculatePerimeter() {
        return (4 * length);
    }

}
