package student_julija_skopeca.practical_tasks.lesson_8.level_5;

class Square extends Shape {
    private int edge;

    Square(int edge){
        super("Square");
        this.edge = edge;
    }

    @Override
    double calculateArea() {
        return (edge*edge);
    }

    @Override
    double calculatePerimeter() {
        return (edge*4);
    }
}
