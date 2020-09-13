package student_igors_mihejevs.lesson_8.homework.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Animal {

    Animal() {
        System.out.println("Animal is created");
    }
    abstract void move();

}
