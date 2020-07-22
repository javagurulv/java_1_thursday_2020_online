package student_julija_skopeca.practical_tasks.lesson_10.level_3.task_8;

import java.util.ArrayList;

class InMemoryDatabase implements Database{

    ArrayList<Product> productsList = new ArrayList<>();

    @Override
    public void save(Product product){
        productsList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle){
        for (Product product: productsList) {
            if (product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }
}
