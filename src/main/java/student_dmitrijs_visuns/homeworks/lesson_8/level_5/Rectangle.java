package student_dmitrijs_visuns.homeworks.lesson_8.level_5;

class Rectangle extends Shape {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        super("rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2*(width + height);
    }

    @Override
    double calculatePerimeter() {
        return width * height;
    }


}
