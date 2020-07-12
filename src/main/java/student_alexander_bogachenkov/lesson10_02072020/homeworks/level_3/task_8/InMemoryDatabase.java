package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_8;

import java.util.ArrayList;

class InMemoryDatabase implements Database {

	// List<Product> ....
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> getProducts() {
        return this.products;
    }

}
