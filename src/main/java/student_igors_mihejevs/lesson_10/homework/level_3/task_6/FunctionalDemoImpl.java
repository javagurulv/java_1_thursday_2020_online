package student_igors_mihejevs.lesson_10.homework.level_3.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FunctionalDemoImpl implements FunctionalInterfaceDemo {

    @Override
    public void printString(String stringName) {
        System.out.println(stringName);
    }

}
