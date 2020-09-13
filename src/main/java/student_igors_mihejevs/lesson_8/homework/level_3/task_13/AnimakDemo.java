package student_igors_mihejevs.lesson_8.homework.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AnimalDemo {

    public static void main(String[] args) {

        Animal bird = new Birds();
        bird.move();
        Animal fish = new Fish();
        fish.move();
        Animal mammals = new Mammals();
        mammals.move();
    }

}
