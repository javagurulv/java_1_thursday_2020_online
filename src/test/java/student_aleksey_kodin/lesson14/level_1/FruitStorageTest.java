package student_aleksey_kodin.lesson14.level_1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    private final FruitStorage fruitStorage = new FruitStorage();
    private List<Apple> apples = new ArrayList<>();

    @Before
    public void startUp() {
        apples = fruitStorage.getAllApples();
    }

    @Test
    public void findAllApplesByRedColorTest() {
        List<Apple> result = fruitStorage.findAllApplesByColor(apples, "red");

        assertEquals(result.size(), 3);
    }

    @Test
    public void findAllApplesByGreenColorTest() {
        List<Apple> result = fruitStorage.findAllApplesByColor(apples, "green");

        assertEquals(result.size(), 3);
    }

    @Test
    public void findAllApplesByYellowColorTest() {
        List<Apple> result = fruitStorage.findAllApplesByColor(apples, "yellow");

        assertEquals(result.size(), 2);
    }

    @Test
    public void findAllApplesByWeightMore100Test() {
        List<Apple> result = fruitStorage.findAllApplesByWeight(apples, 100);

        assertEquals(result.size(), 5);
    }

    @Test
    public void findAllApplesByWeightMore150Test() {
        List<Apple> result = fruitStorage.findAllApplesByWeight(apples, 150);

        assertEquals(result.size(), 4);
    }
}