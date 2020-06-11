package student_vadim_sokolenko.Lesson5HomeWorks.Day2;

import java.util.Random;

class RandomThreeNumberArray {


    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();

        randomNumbers [0] = random.nextInt();
        randomNumbers [1] = random.nextInt();
        randomNumbers [2] = random.nextInt();


        System.out.println("numbers [0] = "+ randomNumbers[0]);
        System.out.println("numbers [1] = "+ randomNumbers[1]);
        System.out.println("numbers [2] = "+ randomNumbers[2]);



    }
    }

