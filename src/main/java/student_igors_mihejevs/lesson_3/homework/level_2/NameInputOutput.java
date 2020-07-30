package student_igors_mihejevs.lesson_3.homework.level_2;

import java.util.Scanner;

class NameInputOutput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input your first name: ");
        String firstName = myInput.next();
        System.out.print("Input your second name: ");
        String secondName = myInput.next();

        System.out.println("\nHello " + firstName + " " + secondName + "!");
    }

}