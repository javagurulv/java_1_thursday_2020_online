package student_dmitrijs_visuns.homeworks.lesson_2.day_2;

import java.util.Scanner;

class Task_8 {
//Задача 6 (level 3) : Написать консольную программу, которая запрашивает имя пользователя и выводит на консоль текст: Hello имя пользователя!

    public static void main(String[] args) {

        System.out.println("What's your name?");
        Scanner enterName = new Scanner(System.in);
        String yourName = enterName.nextLine();
        System.out.println("Hello " + yourName);

    }

}
