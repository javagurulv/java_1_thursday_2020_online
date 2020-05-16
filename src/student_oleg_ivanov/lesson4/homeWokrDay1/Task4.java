package student_oleg_ivanov.lesson4.homeWokrDay1;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number:");
        int userNumber = number.nextInt();

        if ((userNumber % 2 == 0)) {
            System.out.println("Number: " + userNumber + " is even");
        }
        else {
            System.out.println("Number: " + userNumber + " is odd number");

        }



    }
}
