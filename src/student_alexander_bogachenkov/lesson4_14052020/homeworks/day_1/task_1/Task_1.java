package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_1.task_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int userNumber = scanner.nextInt();
        System.out.println(posOrNeg(userNumber));

    }

    public static String posOrNeg(int userNumber) {
        if (userNumber < 0) {
            return "Your number is NEGATIVE";
        } else if (userNumber > 0) {
            return "Your number is POSITIVE";
        } else {
            return "Your number is ZERO";
        }
    }
}
