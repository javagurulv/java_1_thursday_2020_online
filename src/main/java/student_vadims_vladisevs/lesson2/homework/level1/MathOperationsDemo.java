package student_vadims_vladisevs.lesson2.homework.level1;
import java.util.*;

class MathOperationsDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double firstNumber = scr.nextDouble();
        System.out.println("Enter second number : ");
        double secondNumber = scr.nextDouble();

        System.out.println("Choose math operation!");
        System.out.println("If you want addition enter - 1");
        System.out.println("If you want subtraction enter - 2");
        System.out.println("If you want division enter - 3");
        System.out.println("If you want multiplication enter - 4");

        while (true) {
            int result = scr.nextInt();
            if (result == 1) {
                double addResult = firstNumber + secondNumber;
                System.out.println("Addition result : " + addResult);
                break;
            } else if (result == 2) {
                double subResult = firstNumber - secondNumber;
                System.out.println("Subtraction result : " + subResult);
                break;
            } else if (result == 3) {
                double divResult = firstNumber / secondNumber;
                System.out.println("Division result : " + divResult);
                break;
            } else if (result == 4) {
                double multiResult = firstNumber * secondNumber;
                System.out.println("Multiplication result : " + multiResult);
                break;
            } else {
                System.out.println("Error! Entered number does not meet the conditions!!");
                System.out.println("Try again!");
            }
        }
    }
}
