package student_igors_mihejevs.lesson_2.homework.level_2;

import java.util.Random;

class RandomGeneratorDemo {

    public static void main(String[] args) {

        Random randomGen = new Random();
        int randomNumber1 = randomGen.nextInt(1000);
        System.out.println("First random number  = " + randomNumber1);
        int randomNumber2 = randomGen.nextInt(1000);
        System.out.println("Second random number = " + randomNumber2);
        int randomNumber3 = randomGen.nextInt(1000);
        System.out.println("Third random number  = " + randomNumber3);
        System.out.println("--------------------------");
        System.out.println("The sum of all three random numbers = " + (randomNumber1 + randomNumber2 + randomNumber3));
    }
}
