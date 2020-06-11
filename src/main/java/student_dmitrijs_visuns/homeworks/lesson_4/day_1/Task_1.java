package student_dmitrijs_visuns.homeworks.lesson_4.day_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int inputNumber = sc.nextInt();

        if (inputNumber > 0) {
            System.out.println ("Это положительное число");
        }

        if (inputNumber < 0) {
            System.out.println ("Это отрицательное число");
        }

    }

}
