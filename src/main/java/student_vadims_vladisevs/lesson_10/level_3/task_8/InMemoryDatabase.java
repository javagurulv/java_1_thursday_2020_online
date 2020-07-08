package student_vadims_vladisevs.lesson_10.level_3.task_8;

import java.util.ArrayList;

class InMemoryDatabase implements Database{

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
        for (Product tempValue : database){
            if (productTitle.equals(tempValue.getTitle())){
                return tempValue;
            }
        }
        return null;
    }

    public ArrayList<Product> getDatabase() {
        return database;
    }
}
