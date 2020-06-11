package student_diana_miranovica.lesson2.day_2;
//task_6 level_2
//request a user name and display "Hello + user name" on the console
import java.util.Scanner;

 class NameFromUser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String userName = scan.nextLine();

        System.out.println("Hello " + userName);
    }
}
