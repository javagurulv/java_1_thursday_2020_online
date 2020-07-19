package student_vadims_vladisevs.lesson_10.level_3.task_10;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void findByTitleV1() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Optional<Product> result = inMemoryDatabase.findByTitle("First Product");
        String actual = result.get().getTitle();
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

        Optional<Product> result = inMemoryDatabase.findByTitle("null test");

        assertEquals(Optional.empty(), result);
    }

    @Test
    public void findByTitleV3() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Optional<Product> result = inMemoryDatabase.findByTitle("Second Product");
        String actual = result.get().getTitle();
        assertEquals("Second Product", actual);
    }

    @Test
    public void findByTitleV4() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product product1 = new Product("First Product");
        Product product2 = new Product("Second Product");
        Product product3 = new Product("Third Product");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        Optional<Product> result = inMemoryDatabase.findByTitle("Third Product");
        String actual = result.get().getTitle();
        assertEquals("Third Product", actual);
    }
}