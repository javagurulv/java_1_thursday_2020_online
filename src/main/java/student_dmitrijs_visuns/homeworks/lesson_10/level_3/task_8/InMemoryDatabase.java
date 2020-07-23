package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database {

    private List <Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product listItem : productList) {
            if (listItem.getTitle().equals(productTitle)) {
                return listItem;
            }
        } return null;
    }


}
