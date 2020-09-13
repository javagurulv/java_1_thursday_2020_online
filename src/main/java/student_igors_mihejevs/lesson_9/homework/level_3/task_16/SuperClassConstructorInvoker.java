package student_igors_mihejevs.lesson_9.homework.level_3.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super(); // in the constructor should be first
        System.out.println(1);
        System.out.println(2);
    }

}
