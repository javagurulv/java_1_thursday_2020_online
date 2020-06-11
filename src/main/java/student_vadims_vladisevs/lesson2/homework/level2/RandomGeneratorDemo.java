package student_vadims_vladisevs.lesson2.homework.level2;

import java.util.*;

class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstNumber = randomGenerator.nextInt();
        int secondNumber = randomGenerator.nextInt();
        int thirdNumber = randomGenerator.nextInt();

        System.out.println("Randomly generated numbers :");
        System.out.println("1. " + firstNumber + ";");
        System.out.println("2. " + secondNumber + ";");
        System.out.println("3. " + thirdNumber + ";");

        int sumResult = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum of numbers : " + sumResult);

    }
}
