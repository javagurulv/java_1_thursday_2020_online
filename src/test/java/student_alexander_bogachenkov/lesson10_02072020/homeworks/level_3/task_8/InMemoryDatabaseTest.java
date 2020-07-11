package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_3.task_8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {

    @Test
    public void shouldSave() {
        Product product = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Water");
        Product product4 = new Product("Butter");
        Product product5 = new Product("Candies");
        Database database = new InMemoryDatabase();
        database.save(product);
        database.save(product2);
        database.save(product3);
        database.save(product4);
        database.save(product5);
        ArrayList<Product> expected = new ArrayList<Product>();
        expected.add(product);
        expected.add(product2);
        expected.add(product3);
        expected.add(product4);
        expected.add(product5);
        ArrayList<Product> actual = database.getProducts();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByTitle() {
        Product product = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Water");
        Product product4 = new Product("Butter");
        Product product5 = new Product("Candies");
        Database database = new InMemoryDatabase();
        database.save(product);
        database.save(product2);
        database.save(product3);
        database.save(product4);
        database.save(product5);
        Product expected = new Product("Butter");
        Product actual = database.findByTitle("Butter");
        boolean result = expected.equals(actual);
        assertEquals(true, result);
    }

    @Test
    public void shouldNotFindByTitle() {
        Product product = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Water");
        Product product4 = new Product("Butter");
        Product product5 = new Product("Candies");
        Database database = new InMemoryDatabase();
        database.save(product);
        database.save(product2);
        database.save(product3);
        database.save(product4);
        database.save(product5);
        Product expected = new Product("Crisps");
        Product actual = database.findByTitle("Crisps");
        boolean result = expected.equals(actual);
        assertEquals(false, result);
    }
}