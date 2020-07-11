package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

    // List<Product>
    ArrayList<Product> getProducts();

}