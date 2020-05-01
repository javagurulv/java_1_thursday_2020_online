package student_diana_miranovica.home_works;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        double firstNumber = Math.random() * 3;

        System.out.println(firstNumber);

        double secondNumber = 25  + Math.random() * 30;

        System.out.println(secondNumber);

        int thirdNumber = (int) (Math.random() * 3);

        System.out.println(thirdNumber);

        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt( 30);
        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);

    }
}
