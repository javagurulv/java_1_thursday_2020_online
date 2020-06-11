package student_oleg_ivanov.lesson4.homeWokrDay1;

import java.util.Scanner;

class Task3 {
    public static void main(String[] arg) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter day number of this week: ");
        int userNumber = number.nextInt();

        if ((userNumber == 1)) {

            System.out.println("It`s monday");
        }

        if ((userNumber == 2)) {
            System.out.println("It`s tuesday");
        }

        if ((userNumber == 3)) {
            System.out.println("It`s wednesday");
        }

        if ((userNumber == 4)) {
            System.out.println("It`s thursday");
        }

        if ((userNumber == 5)) {
            System.out.println("It`s friday");
        }

        if ((userNumber == 6)) {
            System.out.println("It`s saturday");
        }

        if ((userNumber == 7)) {
            System.out.println("It`s sunday");
        }

        if ((userNumber > 7)) {
            System.out.println("number not correct");
        }
        if ((userNumber < 1)) {
            System.out.println("number not correct");
        }
    }

}