package student_diana_miranovica.lesson2;

import java.util.Random;

class RandomGenerator {
    public static void main(String[] args) {
        double firstNumber = Math.random() * 3;

        System.out.println(firstNumber);

        double secondNumber = 25  + Math.random() * 30;

        System.out.println(secondNumber);

        int thirdNumber = (int) (Math.random() * 6);

        System.out.println(thirdNumber);

        Random randomGenerator = new Random();
        int randomUnbound = randomGenerator.nextInt();
        int randomBound = randomGenerator.nextInt( 30);
        System.out.println("randomUnbound = " + randomUnbound);
        System.out.println("randomBound = " + randomBound);

    }
}
