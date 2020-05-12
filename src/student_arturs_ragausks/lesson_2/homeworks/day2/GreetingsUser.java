package student_arturs_ragausks.lesson_2.homeworks.day2;
//Ask User for his name-->Get an answer to Greet

import java.util.Scanner;

class GreetingsUser {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats Your Name Mate? ");
        String userName = scanner.nextLine();

        System.out.println("Greetings " + userName);


    }
}
