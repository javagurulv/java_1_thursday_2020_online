package student_vadims_vladisevs.lesson_14.level_1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> allApples = fruitStorage.getAllApples();

    @Test
    public void findApplesByColor_red() {
        List<Apple> redApples = fruitStorage.findApplesByColor(allApples, "red");
        assertEquals(3, redApples.size());
    }

    @Test
    public void findApplesByColor_green() {
        List<Apple> greenApples = fruitStorage.findApplesByColor(allApples, "green");
        assertEquals(3, greenApples.size());
    }

    @Test
    public void findApplesByColor_yellow() {
        List<Apple> yellowApples = fruitStorage.findApplesByColor(allApples, "yellow");
        assertEquals(2, yellowApples.size());
    }

    @Test
    public void findApplesByWeight_over150(){
        List<Apple> apples = fruitStorage.findApplesByWeight(allApples, 150);
        assertEquals(4, apples.size());
    }

    @Test
    public void findApplesByWeight_over100(){
        List<Apple> apples = fruitStorage.findApplesByWeight(allApples, 90);
        assertEquals(5, apples.size());
    }
}