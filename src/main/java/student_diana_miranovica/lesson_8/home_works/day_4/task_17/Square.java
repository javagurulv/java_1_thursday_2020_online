package student_diana_miranovica.lesson_8.home_works.day_4.task_17;

public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round((side * side));
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * (side + side));
    }
}
