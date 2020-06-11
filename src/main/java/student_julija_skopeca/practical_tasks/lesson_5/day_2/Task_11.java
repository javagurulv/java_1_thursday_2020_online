package student_julija_skopeca.practical_tasks.lesson_5.day_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] number = new int[3];

        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);

        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();

        System.out.println("Entered numbers are " + Arrays.toString(number));

    }
}
