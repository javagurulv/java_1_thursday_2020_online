package student_aleksey_kodin.lesson10.level3.task_10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InMemoryDatabaseTest {
    Product product = new Product("Product#1");
    InMemoryDatabase database = new InMemoryDatabase();

    @Test
    public void testFindByTitle_WaitingProduct() {
        database.save(product);
        Product result = database.findByTitle("Product#1");

        assertEquals("Product#1",result.getTitle());
    }

    @Test
    public void testFindByTitle_WaitingNull() {
        database.save(product);
        Product result = database.findByTitle("Product#2");

        assertNull(result);
    }
}