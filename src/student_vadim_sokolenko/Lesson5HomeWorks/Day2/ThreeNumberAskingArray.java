package student_vadim_sokolenko.Lesson5HomeWorks.Day2;

import java.util.Scanner;

class ThreeNumberAskingArray {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        numbers[0] = scan.nextInt();

        System.out.println("Enter second number");
        numbers[1] = scan.nextInt();

        System.out.println("Enter third number");
        numbers[2] = scan.nextInt();

        System.out.println("numbers[0]" + numbers[0]);
        System.out.println("numbers[0]" + numbers[1]);
        System.out.println("numbers[0]" + numbers[2]);


    }
}
