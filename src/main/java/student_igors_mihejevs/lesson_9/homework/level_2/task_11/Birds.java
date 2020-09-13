package student_igors_mihejevs.lesson_9.homework.level_2.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Birds extends Animal {

    protected Birds(int numberOfLegs) {
        super(numberOfLegs);
    }

    public static void main(String[] args) {

        Animal animal = new Animal(2);
        System.out.println("Birds have " + animal.numberOfLegs + " legs");
    }

}
