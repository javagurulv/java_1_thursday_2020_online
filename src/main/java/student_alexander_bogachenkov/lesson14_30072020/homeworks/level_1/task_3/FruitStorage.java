package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_1.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Apple> getAllApplesByColor(String color) {
        FruitStorage storage = new FruitStorage();
        return storage.getAllApples().stream()
                .filter(apple -> apple.getColor().equals(color))
                .collect(Collectors.toList());
    }

}
