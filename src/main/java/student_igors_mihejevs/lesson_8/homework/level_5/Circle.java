package student_igors_mihejevs.lesson_8.homework.level_5;

import static java.lang.StrictMath.PI;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape {

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
