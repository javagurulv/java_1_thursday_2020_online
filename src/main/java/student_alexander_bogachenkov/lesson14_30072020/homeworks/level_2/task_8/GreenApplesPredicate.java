package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_2.task_8;

class GreenApplesPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }

}

class RedApplesPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }

}

class HeavyApplesPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

}

class LightApplesPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }

}