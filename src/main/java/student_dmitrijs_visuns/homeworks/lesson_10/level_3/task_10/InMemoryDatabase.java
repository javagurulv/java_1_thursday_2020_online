package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {

    private List <Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
        for (Product listItem : productList) {
            if (listItem.getTitle().equals(productTitle)) {
                return Optional.of(listItem);
            }
        } return Optional.empty();
    }



}
