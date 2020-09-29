package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_10;

@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}


class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getColor().equals("green");
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getColor().equals("red");
    }
}

class AppleLightWeightPredicate implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}


class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() >= 150;
    }
}