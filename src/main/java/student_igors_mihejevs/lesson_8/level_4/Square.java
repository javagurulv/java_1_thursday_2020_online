package student_igors_mihejevs.lesson_8.level_4;

class Square extends Shape{
    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * this.side;
    }

}
