package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFind1HeavyGreenApple () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples,
                (Apple apple) -> apple.getColor().equals("green")
                        && apple.getWeight() >= 150);
        assertEquals(1, result.size());
    }


    @Test
    public void shouldFind3GreenApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples,
                (Apple apple) -> apple.getColor().equals("green"));
        assertEquals(3, result.size());
    }


    @Test
    public void shouldFind3RedApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples,
                (Apple apple) -> apple.getColor().equals("red"));
        assertEquals(3, result.size());
    }


    @Test
    public void shouldFind4LightApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples,
                (Apple apple) -> apple.getWeight() < 150);
        assertEquals(4, result.size());
    }

    @Test
    public void shouldFind4HeavyApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List<Apple> result = testStorage.filterApples(allApples,
                (Apple apple) -> apple.getWeight() >= 150);
        assertEquals(4, result.size());
    }

}