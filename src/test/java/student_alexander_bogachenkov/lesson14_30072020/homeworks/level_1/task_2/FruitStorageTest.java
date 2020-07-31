package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_1.task_2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldReturnAllGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.getAllApplesByColor("green");
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldReturnAllRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> actual = fruitStorage.getAllApplesByColor("red");
        assertEquals(3, actual.size());
    }

}