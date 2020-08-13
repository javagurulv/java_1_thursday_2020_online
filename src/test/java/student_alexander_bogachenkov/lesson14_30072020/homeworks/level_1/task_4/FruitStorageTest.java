package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_1.task_4;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldReturnAllGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.filterApplesByColor(fruitStorage.getAllApples(), "green");
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldReturnAllRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.filterApplesByColor(fruitStorage.getAllApples(), "red");
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldReturnAllYellowApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.filterApplesByColor(fruitStorage.getAllApples(), "yellow");
        assertEquals(2, actual.size());
    }

}