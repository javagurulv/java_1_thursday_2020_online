package student_vladimir_filipov.lesson2_hometasks;


import java.util.Scanner;

public class Task1_Integer {

    public static void main(String[] args) {

        System.out.println("Enter the first integer");
        Scanner myFirstInput = new Scanner( System.in );
        int firstNumber = myFirstInput.nextInt();

        System.out.println("Enter the second integer");
        Scanner mySecondInput = new Scanner( System.in );  // создавать второй Scanner не надо, можно пользоваться первыйм.
        int secondNumber = mySecondInput.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("The summ these numbers is " + sum);

        int subtract = firstNumber - secondNumber;
        System.out.println("The result of subtracting these numbers is " + subtract);

        int multiply = firstNumber * secondNumber;
        System.out.println("The result of multiplying these numbers is " + multiply);

        int divide = firstNumber / secondNumber;
        System.out.println("The result of dividing these numbers is " + divide);

    }
}


