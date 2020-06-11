package student_edgars_lukjanskis.lession_4;

import java.util.Scanner;

class BooleanExample {

    public static void main(String[] args) {

        boolean isTrue = 3 < 0;

        isTrue = true;
        isTrue = false;

        int number = 10;

        boolean isPositive = number > 0;
        System.out.println("Positive = " + isPositive);

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        isPositive = number > 0;

        if (number > 0) {

            System.out.println("Number is Positive!");
        }

        if (number < 0) {

            System.out.println("Number is Negative!");
        }

        if (number == 0) {

            System.out.println("Number is Zero!");
        }

        if (number > 20) {
            System.out.println("Number > 20");

        }

        if (number > 0) {
            System.out.println("Number is Positive!");
        } else {
            System.out.println("Number is Negative or Zero!");

        }

    }
}
