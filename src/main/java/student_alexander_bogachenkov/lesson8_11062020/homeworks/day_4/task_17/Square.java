package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_17;

class Square extends Shape {

    private double sideLength;

    Square(String title, double sideLength) {
        super(title);
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
