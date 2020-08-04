package student_igors_mihejevs.lesson_4.homework.level_1;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> System.out.println("Day name : Monday");
                case 2 -> System.out.println("Day name : Tuesday");
                case 3 -> System.out.println("Day name : Wednesday");
                case 4 -> System.out.println("Day name : Thursday");
                case 5 -> System.out.println("Day name : Friday");
                case 6 -> System.out.println("Day name : Saturday");
                case 7 -> System.out.println("Day name : Sunday");
            }
        }
        else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }

}
