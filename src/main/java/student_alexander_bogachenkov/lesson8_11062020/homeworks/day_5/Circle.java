package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

class Circle extends Shape {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.141592 * (radius * radius));
    }

    @Override
    double calculatePerimeter() {
        return (2 * 3.141592 * radius);
    }

}