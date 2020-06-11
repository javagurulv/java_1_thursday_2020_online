package student_aleksey_kodin.lesson5.dayx.supertask1.day4.task_26;


import java.util.InputMismatchException;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        int[] array;  // объявляйте переменные там где вы их первый раз используете!
        ArrayUtil myArray = new ArrayUtil();

        try {
            System.out.println("Please enter array's length: ");
            int arrayLength =  new Scanner(System.in).nextInt();
            array =myArray.createArray(arrayLength);

            myArray.fillArrayWithRandomNumbers(array);
            myArray.printArrayToConsole(array);
        }  catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
