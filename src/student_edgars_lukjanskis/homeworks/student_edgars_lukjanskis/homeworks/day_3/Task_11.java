package student_edgars_lukjanskis.homeworks.day_3;

import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number ");
        double number1 = scan.nextDouble();
        System.out.println("Enter second number ");
        double number2 = scan.nextDouble();
        System.out.println("Enter third number ");
        double number3 = scan.nextDouble();
           double average = ((number1+number2+number3)/3);
           System.out.println("Average number "+ average);
    }
}
