package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_18;

class Rectangle extends Shape {

    private int windth;
    private int lengh;

    Rectangle(int windth, int lengh){
        super("Rectangle");
        this.windth = windth;
        this.lengh = lengh;
    }

    @Override
    double calculateArea() {
        return (windth*lengh);
    }

    @Override
    double calculatePerimeter() {
        return ((windth*lengh)*2);
    }
}
