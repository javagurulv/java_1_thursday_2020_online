package student_diana_miranovica.lesson6.lesson_code;

import java.util.Scanner;

 class MethodExample {

    public static void main(String[] args) {
        MethodExample2 methodExample2 = new MethodExample2();

        int arrLength = methodExample2.getArrayLengthFromUser();
        int[] arr = methodExample2.createArray(arrLength);
        methodExample2.fillArrayWithNumbersFromUser(arr);
        methodExample2.printArrayToConsole(arr);
    }
}
