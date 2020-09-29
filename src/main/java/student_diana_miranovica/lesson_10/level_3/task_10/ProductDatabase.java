package student_diana_miranovica.lesson_10.level_3.task_10;

import java.util.Optional;

public interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
