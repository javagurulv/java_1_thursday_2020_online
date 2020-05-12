package student_vladimir_filipov.lesson2_hometasks;

import java.util.Scanner;

class Task11_averageThreeNumber {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = myInput.nextInt();

        System.out.println("Input second number: ");
        int num2 = myInput.nextInt();

        System.out.println("Input third number: ");
        int num3 = myInput.nextInt();

        System.out.println("The average of all these numbers is " + ((num1 + num2 + num3) / 3));
    }
}

