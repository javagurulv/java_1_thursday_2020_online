package student_igors_mihejevs.w3resource.basic_exercises_part1;

import java.util.Scanner;

// testing \n inside of println with additional console inputs

public class Exercise1withInput {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input your first name: ");
        String firstName = myInput.next();
        System.out.print("Input your second name: ");
        String secondName = myInput.next();

        System.out.println("\nHello!\n\nPS\n" + firstName + " " + secondName);
    }
}
