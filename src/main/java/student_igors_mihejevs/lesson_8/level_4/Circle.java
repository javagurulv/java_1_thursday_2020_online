package student_igors_mihejevs.lesson_8.level_4;

import static java.lang.StrictMath.PI;

class Circle extends Shape{

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * this.radius;
    }
}
