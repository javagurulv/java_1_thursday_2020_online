package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_8;

import java.util.ArrayList;

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

    public ArrayList<Product> getProducts();

}