package student_vadims_vladisevs.lesson_14.level_2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();
    List<Apple> allApples = fruitStorage.getAllApples();

    @Test
    public void findApples_green() {
        List<Apple> apples = fruitStorage.findApples(allApples, new GreenApplesPredicate());
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_red() {
        List<Apple> apples = fruitStorage.findApples(allApples, new RedApplesPredicate());
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_weightOver150() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplesWeightOver150());
        assertEquals(4, apples.size());
    }

    @Test
    public void findApples_weightLess150() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplesWeightLess150());
        assertEquals(4, apples.size());
    }

    @Test
    public void findApples_greenWeightOver150() {
        List<Apple> apples = fruitStorage.findApples(allApples, new GreenApplesWeightOver150Predicate());
        assertEquals(1, apples.size());
    }

    @Test
    public void findApples_green_v2() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        });
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_red_v2() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_weightOver150_v2() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, apples.size());
    }

    @Test
    public void findApples_weightLess150_v2() {
        List<Apple> apples = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, apples.size());
    }

    @Test
    public void findApples_green_v3() {
        List<Apple> apples = fruitStorage.findApples(allApples, apple -> apple.getColor().equals("green"));
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_red_v3() {
        List<Apple> apples = fruitStorage.findApples(allApples, apple -> apple.getColor().equals("red"));
        assertEquals(3, apples.size());
    }

    @Test
    public void findApples_weightOver150_v3() {
        List<Apple> apples = fruitStorage.findApples(allApples, apple -> apple.getWeight() > 150);
        assertEquals(4, apples.size());
    }

    @Test
    public void findApples_weightLess150_v3() {
        List<Apple> apples = fruitStorage.findApples(allApples, apple -> apple.getWeight() > 150);
        assertEquals(4, apples.size());
    }
}