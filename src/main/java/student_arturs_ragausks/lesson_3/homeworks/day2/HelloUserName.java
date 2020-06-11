package student_arturs_ragausks.lesson_3.homeworks.day2;

import java.util.Scanner;

class HelloUserName {

    public static void main(String[] args){

        Scanner userName = new Scanner(System.in);
        System.out.println("What is your name User? ");
        String phrase1 = userName.nextLine();
        System.out.println(phrase1);

        System.out.println("Hello " + phrase1);

    }

}


