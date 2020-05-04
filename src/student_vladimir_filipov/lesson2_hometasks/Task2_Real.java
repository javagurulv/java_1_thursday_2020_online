package student_vladimir_filipov.lesson2_hometasks;


import java.util.Scanner;

public class Task2_Real {

    public static void main(String[] args) {


        System.out.println("Enter the first real number: ");
        Scanner myFirstInput = new Scanner(System.in);
        double firstNumber = myFirstInput.nextDouble();


        System.out.println("Enter the second real number: ");
        Scanner mySecondInput = new Scanner(System.in);
        double secondNumber = mySecondInput.nextDouble();


        double sum = firstNumber + secondNumber;
        System.out.println("The summ these numbers is " + sum);

        double subtract = firstNumber - secondNumber;

        System.out.println("The result of subtracting these numbers is " + subtract);

        double multiply = firstNumber * secondNumber;

        System.out.println("The result of multiplying these numbers is " + multiply);

        double divide = firstNumber / secondNumber;
        System.out.println("The result of dividing these numbers is " + divide);

    }
}
