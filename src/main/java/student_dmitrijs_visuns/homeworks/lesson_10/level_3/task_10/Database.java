package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);


}