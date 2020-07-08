package student_edgars_lukjanskis.lession_4.homeworks.day_3;

import java.util.Scanner;

class Task_8 {


    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int secondNumber = number2.nextInt();

        Scanner number3 = new Scanner(System.in);
        System.out.println("Enter third number: ");
        int thirdNumber = number3.nextInt();

        if ((firstNumber == secondNumber && secondNumber == thirdNumber)) {
            System.out.println("All numbers are equals !");
        }

         else if((firstNumber != secondNumber && secondNumber != thirdNumber)){
            System.out.println("All numbers are different !");
         }
         else{
            System.out.println("Neither all are equal or different !");
        }
    }
}

