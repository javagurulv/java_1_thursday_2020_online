package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_25;

class Circle {

    private final double radius;

    public Circle(double circleRadius) {
        this.radius = circleRadius;
    }

    public double calculateArea() {
        double area = 3.14 * (this.radius * this.radius);
        return area;
    }

    public void printCircleArea() {
        System.out.println("Circle with radius " + this.radius + " has an area " + calculateArea());
    }
}