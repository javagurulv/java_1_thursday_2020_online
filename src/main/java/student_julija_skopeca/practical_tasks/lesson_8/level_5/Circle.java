package student_julija_skopeca.practical_tasks.lesson_8.level_5;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.round((Math.PI * (radius * radius)));
    }


    @Override
    double calculatePerimeter() {
        return Math.round((Math.PI * 2 * radius));
    }
}
