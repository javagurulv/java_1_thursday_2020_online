package student_diana_miranovica.lesson5.homeworks.day_2;

import java.util.Scanner;

 class ArrayForNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[3] ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        numbers[0] = scanner.nextInt();

        System.out.println("Enter your nest number");
        numbers[1] = scanner.nextInt();

        System.out.println("Enter your third number");
        numbers[2] =  scanner.nextInt();


        System.out.println("Numbers [0] = "+ numbers[0]);
        System.out.println("Numbers [1] = "+ numbers[1]);
        System.out.println("Numbers [2] = "+ numbers[2]);
    }
}
