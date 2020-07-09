package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryDatabase implements Database {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public ArrayList<Product> getProducts() {
        return this.products;
    }

}
