package student_igors_mihejevs.lesson_8.level_4;

class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

}
