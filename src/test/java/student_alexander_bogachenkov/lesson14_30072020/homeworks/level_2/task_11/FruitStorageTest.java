package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_2.task_11;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFindHeavyGreenApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new AppleHeavyGreenColorPredicate());
        assertEquals(1, actual.size());
    }

}