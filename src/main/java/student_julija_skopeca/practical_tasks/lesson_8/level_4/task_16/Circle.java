package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_16;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // implement here calculateArea()

    @Override
    double calculateArea() {
        return Math.round((Math.PI * (radius * radius)));
    }


    // implement here calculatePerimeter()

    @Override
    double calculatePerimeter() {
        return Math.round((Math.PI * 2 * radius));
    }
}
