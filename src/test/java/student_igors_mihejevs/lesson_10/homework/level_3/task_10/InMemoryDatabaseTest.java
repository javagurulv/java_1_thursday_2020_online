package student_igors_mihejevs.lesson_10.homework.level_3.task_10;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class InMemoryDatabaseTest {
    Database products = new InMemoryDatabase();

    @Test
    public void ShouldReturnProductName() {
        Product product = new Product("Product Nr.1");
        products.save(product);
        //System.out.println("Product = " + products.findByTitle("Product Nr.1"));
        assertEquals(Optional.of(product), products.findByTitle("Product Nr.1"));
    }

    @Test
    public void ShouldReturnNull() {
        Product product = new Product("Product Nr.2");
        products.save(product);
        assertEquals(Optional.empty(), products.findByTitle("Product Nr.1"));
    }

}