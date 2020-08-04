package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_2.task_14;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}