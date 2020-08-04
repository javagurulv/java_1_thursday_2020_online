package student_vadims_vladisevs.lesson_14.level_2;

 class GreenApplesPredicate implements ApplePredicate{

     @Override
     public boolean test(Apple apple) {
         return apple.getColor().equals("green");
     }
 }
