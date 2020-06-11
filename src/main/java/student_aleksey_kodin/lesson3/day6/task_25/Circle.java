package student_aleksey_kodin.lesson3.day6.task_25;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return  radius;
    }
    public double getCircleArea () {
        return calculateArea();
    }
    private double calculateArea() {
        return Math.PI * radius * radius;
    }
}
