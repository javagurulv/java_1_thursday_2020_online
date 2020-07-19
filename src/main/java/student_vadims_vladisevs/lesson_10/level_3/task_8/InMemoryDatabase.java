package student_vadims_vladisevs.lesson_10.level_3.task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database{

	// List<Product> ...
    private List<Product> database;

    public InMemoryDatabase(){
        this.database = new ArrayList<>();
    }

    @Override
    public void save(Product product) {
        database.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product tempValue : database){
            if (productTitle.equals(tempValue.getTitle())){
                return tempValue;
            }
        }
        return null;
    }

    public List<Product> getDatabase() {
        return database;
    }
}
