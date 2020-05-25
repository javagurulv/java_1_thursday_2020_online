package student_dmitrijs_visuns.homeworks.lesson_5.day_4;

import java.util.Random;

class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];

        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            int randomNumber = random.nextInt(100);
            array[inputCount - 1] = randomNumber;
        }


        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            System.out.println("Array integer # " + inputCount + " is " + array[inputCount - 1]);
        }


        int arrayMinValue = array[0];
        for (int inputCount = 1; inputCount <= array.length; inputCount++) {

            if (array[inputCount - 1] < arrayMinValue) {
                arrayMinValue = array[inputCount - 1];
            }
        }

        System.out.println("Array min number is " + arrayMinValue);
    }

}
