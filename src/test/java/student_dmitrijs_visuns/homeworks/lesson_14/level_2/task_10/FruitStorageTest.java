package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_10;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFind3GreeApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List <Apple> result = testStorage.filterApples(allApples, new AppleGreenColorPredicate());
        assertEquals(3, result.size());
    }

    @Test
    public void shouldFind3RedApples () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List <Apple> result = testStorage.filterApples(allApples, new AppleRedColorPredicate());
        assertEquals(3, result.size());
    }

    @Test
    public void shouldFind4ApplesLessThan150G () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List <Apple> result = testStorage.filterApples(allApples, new AppleLightWeightPredicate());
        assertEquals(4, result.size());
    }

    @Test
    public void shouldFind4Apples150GOrMore () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        List <Apple> result = testStorage.filterApples(allApples, new AppleHeavyWeightPredicate());
        assertEquals(4, result.size());
    }

}