package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_19;

class Triangle extends Shape{

    private int length;
    private int altitude;

    Triangle(int length, int altitude){
        super("Triangle");
        this.length = length;
        this.altitude = altitude;
    }

    @Override
    double calculateArea() {
        return ((length*altitude)/2);
    }

    @Override
    double calculatePerimeter() {
        return (length*3);
    }
}
