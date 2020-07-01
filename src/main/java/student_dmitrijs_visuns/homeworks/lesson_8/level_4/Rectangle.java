package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

class Rectangle extends Shape {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        super("rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() { return width * height; }

    @Override
    double calculatePerimeter() { return 2*(width + height); }


}
