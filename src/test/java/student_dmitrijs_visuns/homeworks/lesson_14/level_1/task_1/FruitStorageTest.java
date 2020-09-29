package student_dmitrijs_visuns.homeworks.lesson_14.level_1.task_1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFind3GreenApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        assertEquals(testStorage.findGreenApples(allApples).size(), 3);
    }


}