package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

class Square extends Shape {

    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }
}
