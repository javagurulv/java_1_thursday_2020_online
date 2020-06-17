package student_vadims_vladisevs.lesson8.day_4;

class Triangle extends Shape{


    private double firstCathet;
    private double secondCathet;
    private double hypotenuse;

    Triangle(double firstCathet, double secondCathet, double hypotenuse){
        super("Right Triangle");
        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
        this.hypotenuse = hypotenuse;
    }


    @Override
    double calculateArea() {
        return (0.5 * firstCathet * secondCathet);
    }

    @Override
    double calculatePerimeter() {
        return (firstCathet + secondCathet + hypotenuse);
    }
}
