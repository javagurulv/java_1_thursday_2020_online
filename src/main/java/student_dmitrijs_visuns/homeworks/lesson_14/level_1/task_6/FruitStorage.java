package student_dmitrijs_visuns.homeworks.lesson_14.level_1.task_6;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

   public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findApplesLighterThanProvidedWeight(List<Apple> inventory,
                                          int weight)
    {
        List<Apple> result = new ArrayList<>();
            for(Apple apple : inventory) {
                if(apple.getWeight() < weight) {
                    result.add(apple);
                }
            }
            return result;
        }


    public List<Apple> findApplesHeavierThanProvidedWeight(List<Apple> inventory,
                                                           int weight)
    {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight() >= weight) {
                result.add(apple);
            }
        }
        return result;
    }
}
