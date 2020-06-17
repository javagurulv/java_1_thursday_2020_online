package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
