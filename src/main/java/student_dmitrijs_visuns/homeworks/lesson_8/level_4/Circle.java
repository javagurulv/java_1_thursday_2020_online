package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("circle");
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * (radius * 2);
    }

}
