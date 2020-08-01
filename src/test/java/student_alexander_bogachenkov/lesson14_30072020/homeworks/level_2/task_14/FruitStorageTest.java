package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_2.task_14;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFindGreenApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldFindRedApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldFindHeavyApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, actual.size());
    }

    @Test
    public void shouldFindLightApplesByPredicate() {
        FruitStorage storage = new FruitStorage();
        List<Apple> actual = storage.findApples(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(4, actual.size());
    }

}