package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Arrays;
import java.util.Random;

class ArrayMaxNumber {

    public static void main(String[] args) {

        int[] number = new int[10];
        Random random = new Random();


        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(10);
            number[i] = randomNumber;
        }
        System.out.println("The array is " + Arrays.toString(number));

        int maxNumber = 0;
        for (int i = 0; i < number.length; i++){
            if (maxNumber <= number[i]){
                maxNumber = number[i];
            }

        }

        System.out.println("The maximal number in the array is " + maxNumber);
        }
    }



