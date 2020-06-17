package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_19;

class Triangle extends Shape {

    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    Triangle(String title, double firstSideLength, double secondSideLength, double thirdSideLength) {
        super(title);
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }

    @Override
    double calculateArea() {
        double p = (firstSideLength + secondSideLength + thirdSideLength) / 2;
        return Math.sqrt(p * (p - firstSideLength) * (p - secondSideLength) * (p - thirdSideLength));
    }

    @Override
    double calculatePerimeter() {
        return firstSideLength + secondSideLength + thirdSideLength;
    }
}
