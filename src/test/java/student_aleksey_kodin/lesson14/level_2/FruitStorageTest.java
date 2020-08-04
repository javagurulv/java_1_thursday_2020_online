package student_aleksey_kodin.lesson14.level_2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    private final FruitStorage fruitStorage = new FruitStorage();
    private List<Apple> allApples = new ArrayList<>();

    @Before
    public void startUp() {
        allApples = fruitStorage.getAllApples();
    }

    @Test
    public void allRedApples() {
        List<Apple> result = fruitStorage.findApples(allApples, new AppleRedColorPredicate());
        assertEquals(result.size(), 3);
    }

    @Test
    public void allGreenApples() {
        List<Apple> result = fruitStorage.findApples(allApples, new AppleGreenColorPredicate());
        assertEquals(result.size(), 3);
    }

    @Test
    public void allLightApples() {
        List<Apple> result = fruitStorage.findApples(allApples, new AppleLightWeightPredicate());
        assertEquals(result.size(), 4);
    }

    @Test
    public void allHeavyApples() {
        List<Apple> result = fruitStorage.findApples(allApples, new AppleHeavyWeightPredicate());
        assertEquals(result.size(), 4);
    }

    @Test
    public void allGreenHeavyWeightApples() {
        List<Apple> result = fruitStorage.findApples(allApples, new AppleGreenColorHeavyWeightPredicate());
        assertEquals(result.size(), 1);
    }

    @Test
    public void allRedApplesAnonymousClass() {
        List<Apple> result = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(result.size(), 3);
    }

    @Test
    public void allGreenApplesAnonymousClass() {
        List<Apple> result = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(result.size(), 3);
    }

    @Test
    public void allLightApplesAnonymousClass() {
        List<Apple> result = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(result.size(), 4);
    }

    @Test
    public void allHeavyApplesAnonymousClass() {
        List<Apple> result = fruitStorage.findApples(allApples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(result.size(), 4);
    }

    @Test
    public void allRedApplesLambda() {
        List<Apple> result = fruitStorage.findApples(allApples, (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(result.size(), 3);
    }

    @Test
    public void allGreenApplesLambda() {
        List<Apple> result = fruitStorage.findApples(allApples, (Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(result.size(), 3);
    }

    @Test
    public void allLightApplesLambda() {
        List<Apple> result = fruitStorage.findApples(allApples, (Apple apple) -> apple.getWeight() < 150);
        assertEquals(result.size(), 4);
    }

    @Test
    public void allHeavyApplesLambda() {
        List<Apple> result = fruitStorage.findApples(allApples, (Apple apple) -> apple.getWeight() > 150);
        assertEquals(result.size(), 4);
    }

    @Test
    public void allGreenHeavyWeightApplesLambda() {
        List<Apple> result = fruitStorage.findApples(allApples, (Apple apple) ->
                "green".equals(apple.getColor()) && apple.getWeight() > 150);
        assertEquals(result.size(), 1);
    }
}