package student_edgars_lukjanskis.lession_4.homeworks.day_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive !");
        }

        if (number == 0) {
            System.out.println("Zero");
        }
        if (number < 0){
            System.out.println("Number is Negative !");
        }
    }
}
