package student_igors_mihejevs.lesson_8.homework.level_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PetrolCar extends Car{

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        System.out.println("Petrol car is accelerated");
    }
}
