package student_vladimir_filipov.lesson4_hometasks;

import java.util.Scanner;

class BooleanExample {

    public static void main(String[] args) {

        boolean isTrue = 3 < 0;

        isTrue = true;
        isTrue = false;

        int number = 9;

        boolean isPositive = number > 0;
        System.out.println("Positive = " + isPositive);

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive!");
            System.out.println("Number is Positive!");
            System.out.println("Number is Positive!");
        }

        if (number < 0) {
            System.out.println("Number is Negative!");
            System.out.println("Number is Negative!");
            System.out.println("Number is Negative!");
        }

        if (number == 0) {
            System.out.println("Number is Zero!");
            System.out.println("Number is Zero!");
            System.out.println("Number is Zero!");
        }

        if (number > 20) {
            System.out.println("Number > 20!");
        }


        if (number > 0) {
            System.out.println("Number is Positive!");
        } else {
            System.out.println("Number is Negative or Zero!");
        }

    }
}
