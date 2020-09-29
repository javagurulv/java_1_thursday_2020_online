package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_8;

@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}


class findGreenApples implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getColor().equals("green");
    }
}

class findRedApples implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getColor().equals("red");
    }
}

class findApplesWeightLessThan150G implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}


class findApplesWeight150GAndMore implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() >= 150;
    }
}