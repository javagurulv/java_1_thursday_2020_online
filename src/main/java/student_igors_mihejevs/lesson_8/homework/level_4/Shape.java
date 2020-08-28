package student_igors_mihejevs.lesson_8.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
