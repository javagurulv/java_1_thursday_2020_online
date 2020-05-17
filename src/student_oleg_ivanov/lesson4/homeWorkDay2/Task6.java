package student_oleg_ivanov.lesson4.homeWorkDay2;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int userNumber1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Please enter second number: ");
        int userNumber2 = number2.nextInt();

        if ((userNumber1 < userNumber2)) {
            System.out.println("The smallest number is " + userNumber1);
        }
        else{
            System.out.println("The smallest number is " + userNumber2); }

    }

}
