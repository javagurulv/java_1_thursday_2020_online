package student_dmitrijs_visuns.homeworks.lesson_3.day_2;
// Программа должна спрашивать как зовут пользователя,
//считывать его имя с консоли и выводить приветствие
//в виде: "Hello UserName!".

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        Scanner nameInput = new Scanner( System.in );
        System.out.println("What's your name?");

        String yourName = nameInput.nextLine();

        System.out.println("Hello " + yourName + "!");

    }


}
