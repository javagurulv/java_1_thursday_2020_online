package student_edgars_lukjanskis.homeWorks.day_3;

import java.util.Scanner;

public class task_9 {

    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
            System.out.println("Enter your number ");
                int number = scr.nextInt();
                    for (int i = 1; i < 11; i++){
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }




    }
}