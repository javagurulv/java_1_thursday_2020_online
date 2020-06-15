package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_17;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}