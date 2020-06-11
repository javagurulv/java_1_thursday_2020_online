package student_oleg_ivanov.lesson4.homeWorkDay2;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int userNumber1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Please enter second number: ");
        int userNumber2 = number2.nextInt();

        if ((userNumber1 == userNumber2)) {
            System.out.println("The number " + userNumber1 + " and " + userNumber2 + " are equals.");
        }
        else{
            System.out.println("The number " + userNumber1 + " and " + userNumber2 + " are different."); }

    }


}
