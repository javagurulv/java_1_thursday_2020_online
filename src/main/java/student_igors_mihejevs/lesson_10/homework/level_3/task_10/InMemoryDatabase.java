package student_igors_mihejevs.lesson_10.homework.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products){
            if (product.getTitle().equals(productTitle)) return Optional.of(product);
        }
        return Optional.empty();
    }

}
