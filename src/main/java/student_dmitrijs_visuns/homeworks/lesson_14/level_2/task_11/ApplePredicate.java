package student_dmitrijs_visuns.homeworks.lesson_14.level_2.task_11;

@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}


class HeavyGreenApplePredicate implements ApplePredicate {
    @Override
    public boolean test (Apple apple) {
        return apple.getColor().equals("green")
               && apple.getWeight() >= 150;
    }
}