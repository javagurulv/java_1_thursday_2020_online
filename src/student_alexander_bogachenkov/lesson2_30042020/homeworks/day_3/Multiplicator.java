package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_3;

import java.util.Scanner;

class Multiplicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int userNum = scanner.nextInt();
        System.out.println(userNum + " x " + 1 + " = " + (userNum));
        System.out.println(userNum + " x " + 2 + " = " + (userNum * 2));
        System.out.println(userNum + " x " + 3 + " = " + (userNum * 3));
        System.out.println(userNum + " x " + 4 + " = " + (userNum * 4));
        System.out.println(userNum + " x " + 5 + " = " + (userNum * 5));
        System.out.println(userNum + " x " + 6 + " = " + (userNum * 6));
        System.out.println(userNum + " x " + 7 + " = " + (userNum * 7));
        System.out.println(userNum + " x " + 8 + " = " + (userNum * 8));
        System.out.println(userNum + " x " + 9 + " = " + (userNum * 9));
        System.out.println(userNum + " x " + 10 + " = " + (userNum * 10));
    }
}
