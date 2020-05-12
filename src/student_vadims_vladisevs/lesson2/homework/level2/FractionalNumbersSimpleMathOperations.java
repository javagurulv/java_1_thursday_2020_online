package student_vadims_vladisevs.lesson2.homework.level2;
import java.util.*;

class FractionalNumbersSimpleMathOperations {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double firstNumber = scr.nextDouble();
        System.out.println("Enter second number : ");
        double secondNumber = scr.nextDouble();

        double addResult = firstNumber + secondNumber;
        System.out.println("Addition result : " + addResult);

        double subResult = firstNumber - secondNumber;
        System.out.println("Subtraction result : " + subResult);

        double divResult = firstNumber / secondNumber;
        System.out.println("Division result : " + divResult);

        double multiResult = firstNumber * secondNumber;
        System.out.println("Multiplication result : " + multiResult);

    }
}
