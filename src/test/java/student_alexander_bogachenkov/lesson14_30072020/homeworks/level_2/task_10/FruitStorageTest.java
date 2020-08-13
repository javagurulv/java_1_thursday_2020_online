package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_2.task_10;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFindGreenApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new AppleGreenColorPredicate());
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldFindRedApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new AppleRedColorPredicate());
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldFindHeavyApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new AppleHeavyWeightPredicate());
        assertEquals(4, actual.size());
    }

    @Test
    public void shouldFindLightApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new AppleLightWeightPredicate());
        assertEquals(4, actual.size());
    }

}