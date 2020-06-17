package student_vadim_sokolenko.Lesson4.lesson4Day3Tasks;

import java.util.Scanner;

class MaxValueNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();

        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();


        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " is the biggest number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " is the biggest number");
        } else {
            System.out.println(thirdNumber + " is the biggest number");
        }
    }
}
