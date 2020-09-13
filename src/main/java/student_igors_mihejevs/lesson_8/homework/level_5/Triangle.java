package student_igors_mihejevs.lesson_8.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    @Override
    double calculateArea() {
        return Math.sqrt((calculatePerimeter() / 2) * ((calculatePerimeter() / 2) - this.sideA)
                * ((calculatePerimeter() / 2) - this.sideB) * ((calculatePerimeter() / 2) - this.sideC));
    }

    @Override
    double calculatePerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }

}
