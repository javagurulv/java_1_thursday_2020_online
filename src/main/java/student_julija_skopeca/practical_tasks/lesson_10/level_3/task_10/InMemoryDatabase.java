package student_julija_skopeca.practical_tasks.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryDatabase implements Database {

    ArrayList<Product> productsList = new ArrayList<>();

    @Override
    public void save(Product product){
        productsList.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle){
        return productsList
                .stream()
                .filter(
                    p -> p.getTitle().equals(productTitle)
                )
                .findFirst();
//        for (Product product: productsList) {
//            if (product.getTitle().equals(productTitle)){
//                return product;
//            }
//        }
//        return null;
    }
}
