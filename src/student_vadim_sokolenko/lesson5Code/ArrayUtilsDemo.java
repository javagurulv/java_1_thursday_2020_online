package student_vadim_sokolenko.lesson5Code;

import java.util.Random;



class ArrayUtilsDemo {

    public static void main(String[] args) {

        int[] integerArray = new int[10];

        Random random = new Random();
        for(int i = 0; i< integerArray.length; i++){
        integerArray[i] = random.nextInt( 101);


        }
        ArrayUtils.printArray(integerArray);


        int sumResult = ArrayUtils.sum(integerArray);
        System.out.print("Sum =" + sumResult);
    }
}
