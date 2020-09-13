package student_igors_mihejevs.lesson_8.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {
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
