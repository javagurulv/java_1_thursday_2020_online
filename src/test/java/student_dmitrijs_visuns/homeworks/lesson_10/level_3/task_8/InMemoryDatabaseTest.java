package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void NoSuchProductInDatabase () {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Potato");
        Product product3 = new Product("Sugar");
        InMemoryDatabase database = new InMemoryDatabase();
        database.save(product1);
        database.save(product2);
        database.save(product1);
        database.save(product3);
        assertTrue(database.findByTitle("Sausage") == null);
    }


    @Test
    public void ProductIsInDatabase () {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Potato");
        Product product3 = new Product("Sugar");
        InMemoryDatabase database = new InMemoryDatabase();
        database.save(product1);
        database.save(product2);
        database.save(product1);
        database.save(product3);
        assertTrue(database.findByTitle("Potato").getTitle().equals("Potato"));
    }

}