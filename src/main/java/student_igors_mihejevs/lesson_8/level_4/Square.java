package student_igors_mihejevs.lesson_8.level_4;

class Square extends Shape{
    private double lengthOfSide;

    Square(double lengthOfSide) {
        super("Square");
        this.lengthOfSide = lengthOfSide;
    }

    public double getSide() {
        return this.lengthOfSide;
    }

    @Override
    double calculateArea() {
        return this.lengthOfSide * this.lengthOfSide;
    }

    @Override
    double calculatePerimeter() {
        return 4 * this.lengthOfSide;
    }

}
