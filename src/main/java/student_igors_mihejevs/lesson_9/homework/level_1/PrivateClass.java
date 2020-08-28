package student_igors_mihejevs.lesson_9.homework.level_1;

/*
We can't assign private to outer class.
A top-level (outer) class as private would be completely useless because nothing would have access to it.
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PrivateClass {

    private String title;
    private String author;

}
