package student_aleksey_kodin.lesson4.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            int secondValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter third int value: ");
            int thirdValue = new Scanner(System.in).nextInt();

            if ((firstValue < secondValue) && (firstValue < thirdValue) && (secondValue < thirdValue)) {
                System.out.println("increasing");
            } else if((firstValue > secondValue) && (firstValue > thirdValue) && (secondValue > thirdValue)) {
                System.out.println("decreasing");
            } else {
                System.out.println("Neither increasing or decreasing order");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
