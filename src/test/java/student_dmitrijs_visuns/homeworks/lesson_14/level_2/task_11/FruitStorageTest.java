package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_11;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFind1HeavyGreenApple () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples, new HeavyGreenApplePredicate());
        assertEquals(1, result.size());
    }

}