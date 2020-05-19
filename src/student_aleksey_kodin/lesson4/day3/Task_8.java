package student_aleksey_kodin.lesson4.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int secondValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter third int value: ");
            int thirdValue = new Scanner(System.in).nextInt();

            if ((firstValue == secondValue) && (firstValue == thirdValue)) {
                System.out.println("All numbers are equal");
            }else if(firstValue != secondValue && firstValue != thirdValue) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
