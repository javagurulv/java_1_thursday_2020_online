package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_2;

import java.util.Scanner;

class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя пользователя:");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");


    }
}
