package student_vadims_vladisevs.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryDatabase implements Database {

    private ArrayList<Product> database;

    public InMemoryDatabase(){
        this.database = new ArrayList<>();
    }

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
     Optional<Product> optionalProduct;

     for (Product product : database){
          optionalProduct = Optional.of(product).filter(product1 -> product.getTitle().equals(productTitle));
         if (optionalProduct.isPresent()){
             return product;
         }
     }
    return null;
    }
}
