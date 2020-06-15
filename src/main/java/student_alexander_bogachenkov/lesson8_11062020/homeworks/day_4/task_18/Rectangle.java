package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_18;

class Rectangle extends Shape {

    private double firstSideLength;
    private double secondSideLength;

    Rectangle(String title, double firstSideLength, double secondSideLength) {
        super(title);
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
