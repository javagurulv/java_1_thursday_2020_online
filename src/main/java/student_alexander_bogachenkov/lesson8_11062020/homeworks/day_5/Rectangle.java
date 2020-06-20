package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

class Rectangle extends Shape {

    private double firstSideLength;
    private double secondSideLength;

    Rectangle(double firstSideLength, double secondSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    @Override
    double calculateArea() {
        return firstSideLength * secondSideLength;
    }

    @Override
    double calculatePerimeter() {
        return (firstSideLength + secondSideLength) * 2;
    }
}
