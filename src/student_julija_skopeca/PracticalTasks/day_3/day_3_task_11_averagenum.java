package student_julija_skopeca.PracticalTasks.day_3;

import java.util.Scanner;

public class day_3_task_11_averagenum {

    public static void main(String[] args) {

        System.out.println("Enter a number 1");
        Scanner myInput = new Scanner(System.in);
        int number1 = myInput.nextInt();

        System.out.println("Enter a number 2");
        Scanner myInput2 = new Scanner(System.in);
        int number2 = myInput2.nextInt();

        System.out.println("Enter a number 3");
        Scanner myInput3 = new Scanner(System.in);
        int number3 = myInput3.nextInt();

        System.out.println("Average number of (" + number1
            + ", " + number2 + ", " + number3 + ") = " + ((number1+number2+
                number3) /3));
    }
}
