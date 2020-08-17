package student_diana_miranovica.lesson_8.home_works.day_5.base;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * (width + length));
    }

    @Override
    double calculateArea() {
        return Math.round((width * length));
    }
}
