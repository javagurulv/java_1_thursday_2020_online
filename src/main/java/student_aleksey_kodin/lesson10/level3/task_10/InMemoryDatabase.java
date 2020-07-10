package student_aleksey_kodin.lesson10.level3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {
    private final List<Product> database = new ArrayList<>();

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override // это не правильное применение Optional
	// нужно, что бы этот метод возвращал Optional<Product>
    public Product findByTitle(String productTitle) {
        Optional<Product> searchProduct;

        searchProduct = database.stream().filter(product -> product.getTitle().equals(productTitle)).findFirst();

        return searchProduct.orElse(null);

    }
}
