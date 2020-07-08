package student_vadims_vladisevs.lesson_10.level_3.task_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void save() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        int actual = inMemoryDatabase.getDatabase().size();
        assertEquals(3,actual);
    }

    @Test
    public void findByTitleV1() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Product result = inMemoryDatabase.findByTitle("First Product");
        String actual = result.getTitle();
        assertEquals("First Product", actual);
    }

    @Test
    public void findByTitleV2() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Product result = inMemoryDatabase.findByTitle("null test");

        assertNull(result);
    }
}