package student_dmitrijs_visuns.homeworks.lesson_8.level_5;

class Square extends Shape {

    private double side;

    public Square (double side) {
        super("square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }


}
