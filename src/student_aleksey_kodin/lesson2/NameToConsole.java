package student_aleksey_kodin.lesson2;

import java.util.Scanner;

public class NameToConsole {

    public static void main(String[] args) {
        System.out.println("Please enter Your name: ");
        String strFirstName = new Scanner(System.in).nextLine();

        System.out.println("Hello "+ strFirstName + "!");
    }
}
