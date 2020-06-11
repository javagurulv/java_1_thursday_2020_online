package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7:");
        int userNum = scanner.nextInt();
        if (userNum == 1) {
            System.out.println("Monday");
        } else if (userNum == 2) {
            System.out.println("Tuesday");
        } else if (userNum == 3) {
            System.out.println("Wednesday");
        } else if (userNum == 4) {
            System.out.println("Thursday");
        } else if (userNum == 5) {
            System.out.println("Friday");
        } else if (userNum == 6) {
            System.out.println("Saturday");
        } else if (userNum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Your number isn`t in diapason from 1 to 7");
        }
    }
}
