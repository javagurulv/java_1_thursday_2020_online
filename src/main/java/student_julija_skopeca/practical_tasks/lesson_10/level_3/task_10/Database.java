package student_julija_skopeca.practical_tasks.lesson_10.level_3.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
