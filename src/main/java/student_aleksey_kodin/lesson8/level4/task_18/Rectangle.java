package student_aleksey_kodin.lesson8.level4.task_18;

class Rectangle extends Shape {

    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return Math.round((width * height));
    }
    @Override
    double calculatePerimeter() {
        return Math.round((2 * width) + (2 * height));
    }
}
