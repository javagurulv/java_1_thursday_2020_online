package student_vadims_vladisevs.lesson4.homework.day_1;

import java.sql.SQLOutput;
import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter number from 1 to 7: ");
        int number = scr.nextInt();

        if ((number > 0) && (number < 8)){
            if (number == 1){
                System.out.println("Monday");
            }
            else if (number == 2){
                System.out.println("Tuesday");
            }
            else if (number == 3){
                System.out.println("Wednesday");
            }
            else if (number == 4){
                System.out.println("Thursday");
            }
            else if (number == 5){
                System.out.println("Friday");
            }
            else if (number == 6){
                System.out.println("Saturday");
            }
            else {
                System.out.println("Sunday");
            }

        }
        else {
            System.out.println("Entered number out of range!");
        }

    }
}
