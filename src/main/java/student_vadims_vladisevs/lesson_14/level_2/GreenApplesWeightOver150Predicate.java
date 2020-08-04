package student_vadims_vladisevs.lesson_14.level_2;

class GreenApplesWeightOver150Predicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return (apple.getWeight() > 150) && (apple.getColor().equals("green"));
    }
}
