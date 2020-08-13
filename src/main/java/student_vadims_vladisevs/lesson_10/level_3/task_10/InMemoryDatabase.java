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
	// это не правильное применение Optional
	// нужно, что бы этот метод возвращал Optional<Product>
    public Optional<Product> findByTitle(String productTitle) {
     Optional<Product> optionalProduct;

     for (Product product : database){
          optionalProduct = Optional.of(product).filter(product1 -> product.getTitle().equals(productTitle));
         if (optionalProduct.isPresent()){
             return optionalProduct;
         }
     }
    return Optional.empty();
    }
}
