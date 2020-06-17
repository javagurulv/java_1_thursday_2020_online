package student_vadims_vladisevs.lesson8.day_4;

class Rectangle extends Shape{

    private double width;
    private double length;

    Rectangle(double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;
    }




    @Override
    double calculateArea() {
        return (width * length);
    }

    @Override
    double calculatePerimeter() {
        return ((2 * width) + (2 * length));
    }
}
