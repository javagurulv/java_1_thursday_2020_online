package student_igors_mihejevs.lesson_8.level_5;

abstract class Shape {

    String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    String getTitle() {
        return title;
    }
}
