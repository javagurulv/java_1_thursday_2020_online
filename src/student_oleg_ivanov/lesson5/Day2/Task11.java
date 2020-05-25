package student_oleg_ivanov.lesson5.Day2;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        System.out.println("Please enter first number");
        Scanner myInput1 = new Scanner(System.in);
        numbers[0] = myInput1.nextInt();

        System.out.println("Please enter second number");
        Scanner myInput2 = new Scanner(System.in);
        numbers[1] = myInput2.nextInt();

        System.out.println("Please enter third number");
        Scanner myInput3 = new Scanner(System.in);
        numbers[2] = myInput3.nextInt();

        System.out.println("Numbers from array [0] = " + numbers[0]);
        System.out.println("Numbers from array [1] = " + numbers[1]);
        System.out.println("Numbers from array [2] = " + numbers[2]);
    }

}
