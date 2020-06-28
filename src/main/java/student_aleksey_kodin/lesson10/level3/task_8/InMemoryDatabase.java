package student_aleksey_kodin.lesson10.level3.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {
    private final List<Product> database = new ArrayList<>();

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product searchProduct : database) {
            if (searchProduct.getTitle().equals(productTitle)) {
                return searchProduct;
            }
        }
        return null;
    }
}
