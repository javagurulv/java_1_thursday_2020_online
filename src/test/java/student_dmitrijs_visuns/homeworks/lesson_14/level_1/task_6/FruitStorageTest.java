package student_dmitrijs_visuns.homeworks.lesson_14.level_1.task_6;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void shouldFind4ApplesLessThan150G () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        assertEquals(testStorage.findApplesLighterThanProvidedWeight
                (allApples, 150).size(), 4);
    }


    @Test
    public void shouldFind4ApplesMoreThan150G () {
        FruitStorage testStorage = new FruitStorage();
        List<Apple> allApples = testStorage.getAllApples();
        assertEquals(testStorage.findApplesHeavierThanProvidedWeight
                (allApples, 150).size(), 4);
    }

}