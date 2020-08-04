package student_igors_mihejevs.lesson_10.homework.level_3.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
