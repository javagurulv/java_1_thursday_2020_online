package student_igors_mihejevs.lesson_5.day_x.super_task_1;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayUtil myArray = new ArrayUtil();

        System.out.print("Input array length : ");
        int arrayLength = userInput.nextInt();
        int[] array = myArray.createArray(arrayLength);
        myArray.fillArrayWithUserNumbers(array);
        myArray.printArrayToConsole(array);
    }

}
