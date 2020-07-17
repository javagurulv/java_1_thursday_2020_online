package student_dmitrijs_visuns.homeworks.lesson_10.level_3.task_10;

import org.junit.Test;

import java.util.Optional;

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
        assertEquals(database.findByTitle("Sausage"), Optional.empty());
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
        assertEquals(database.findByTitle("Potato"), Optional.of(product2));
    }

    @Test
    public void NoProductsInDatabase () {
        InMemoryDatabase database = new InMemoryDatabase();
        assertEquals(database.findByTitle("Milk"), Optional.empty());
    }

}