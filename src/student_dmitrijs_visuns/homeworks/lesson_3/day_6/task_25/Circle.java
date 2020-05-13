package student_dmitrijs_visuns.homeworks.lesson_3.day_6.task_25;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

}
