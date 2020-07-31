package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_1.task_1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldReturnAllGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.getAllGreenApples();
        assertEquals(3, actual.size());
    }
}