package student_igors_mihejevs.lesson_8.homework.level_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main (String [] args) {
        Car car = new Car();

        System.out.println(car.model);
        System.out.println(car.maxSpeed);
    }

}
