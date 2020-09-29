package student_diana_miranovica.lesson_10.level_3.task_8;

import java.util.ArrayList;

public class InMemoryDatabase implements Database {

    ArrayList<Product> product = new ArrayList<>();

    @Override
    public void save(Product products){
        product.add(products);
    }

    @Override
    public Product findByTitle(String productTitle){
        for (Product product: product) {
            if (product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product>getProduct(){
        return this.product;
    }

}
