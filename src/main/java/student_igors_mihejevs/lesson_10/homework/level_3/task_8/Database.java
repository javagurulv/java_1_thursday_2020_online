package student_igors_mihejevs.lesson_10.homework.level_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
