package student_igors_mihejevs.lesson_8.homework.level_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {
        System.out.println("Electric car is accelerated");
    }
}
