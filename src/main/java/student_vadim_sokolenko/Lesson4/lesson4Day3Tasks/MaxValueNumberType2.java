package student_vadim_sokolenko.Lesson4.lesson4Day3Tasks;

import java.util.Scanner;

class MaxValueNumberType2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();

        System.out.println("Please enter third number: ");
        int thirdNumber = scan.nextInt();


        int maxValue;

        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxValue = firstNumber;
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
            maxValue = secondNumber;
        }else{
            maxValue = thirdNumber;
        }

        int maxMathValueMethod = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        System.out.println("Biggest number is "+ maxMathValueMethod);

    }
}
