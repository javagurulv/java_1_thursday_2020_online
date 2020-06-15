package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_16;

class Circle extends Shape {

    private final double radius;

    Circle(String title, double radius) {
        super(title);
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