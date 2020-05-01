package student_vadims_vladisevs.lesson2.Homework.Level2;

import java.util.*;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        double firstNumber = randomGenerator.nextInt();
        double secondNumber = randomGenerator.nextInt();
        double thirdNumber = randomGenerator.nextInt();

        System.out.println("Randomly generated numbers :");
        System.out.println("1. " + firstNumber + ";");
        System.out.println("2. " + secondNumber + ";");
        System.out.println("3. " + thirdNumber + ";");

        double sumResult = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum of numbers : " + sumResult);

    }
}
