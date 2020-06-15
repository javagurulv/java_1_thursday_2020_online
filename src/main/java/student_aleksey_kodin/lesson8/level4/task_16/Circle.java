package student_aleksey_kodin.lesson8.level4.task_16;

class Circle extends Shape{

    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.round((Math.PI * radius * radius));
    }
    @Override
    double calculatePerimeter() {
        return Math.round((2 * Math.PI * radius));
    }
}
