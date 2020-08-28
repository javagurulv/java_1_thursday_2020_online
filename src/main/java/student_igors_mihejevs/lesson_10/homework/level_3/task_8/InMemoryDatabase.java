package student_igors_mihejevs.lesson_10.homework.level_3.task_8;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products){
            if (product.getTitle().equals(productTitle)) return product;
        }
        return null;
    }

}
