package student_vadims_vladisevs.lesson_14.level_2;

class ApplesWeightOver150 implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
