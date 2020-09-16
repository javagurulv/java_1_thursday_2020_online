package student_igors_mihejevs.lesson_10.homework.level_3.task_8;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class InMemoryDatabaseTest {
    Database products = new InMemoryDatabase();

    @Test
    public void ShouldReturnProductName() {
        Product product = new Product("Product Nr.1");
        products.save(product);
        assertEquals(product, products.findByTitle("Product Nr.1"));
    }

    @Test
    public void ShouldReturnNull() {
        Product product = new Product("Product Nr.2");
        products.save(product);
        assertNull(products.findByTitle("Product Nr.1"));
    }

}