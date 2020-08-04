package student_aleksey_kodin.lesson14.level_2;

@FunctionalInterface
interface ApplePredicate {
    boolean test(Apple apple);
}

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}

class AppleGreenColorHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
