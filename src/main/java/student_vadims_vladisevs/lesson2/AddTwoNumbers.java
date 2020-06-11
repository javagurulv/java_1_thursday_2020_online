package student_vadims_vladisevs.lesson2;
import java.util.*;

class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = scr.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = scr.nextInt();
        int result = firstNumber + secondNumber;

        System.out.println("Result = " + result);
    }
}
