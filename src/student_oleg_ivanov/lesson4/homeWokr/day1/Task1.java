package student_oleg_ivanov.lesson4.homeWokr.day1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int userNumber = number.nextInt();

        if ((userNumber > 0)){
            System.out.println("User number: " + userNumber + " is positive.");
        }

        else{
            System.out.println(" User number: " + userNumber + " is negative.");
        }

    }
}

