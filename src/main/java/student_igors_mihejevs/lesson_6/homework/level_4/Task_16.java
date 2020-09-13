package student_igors_mihejevs.lesson_6.homework.level_4;

import java.util.Scanner;

class Task_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Loop While: Please input number between 1 and 3 : ");
            int inputNumber = sc.nextInt();
            if (inputNumber >= 1 && inputNumber <= 3) break;
        }

        for (;;) {
            System.out.print("Loop For: Please input number between 1 and 3 : ");
            int inputNumber = sc.nextInt();
            if (inputNumber >= 1 && inputNumber <= 3) break;
        }
    }

}
