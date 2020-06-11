package student_aleksey_kodin.lesson2.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first double value: ");
            //зачем префикс d? итак по типу данных видно, что это дробное число
            double dFirstValue = new Scanner(System.in).nextDouble();

            System.out.println("Please enter second double value: ");
            //зачем префикс d? итак по типу данных видно, что это дробное число
            double dSecondValue = new Scanner(System.in).nextDouble();

            System.out.println(dFirstValue + " + " + dSecondValue + " = " + (dFirstValue + dSecondValue));
            System.out.println(dFirstValue + " - " + dSecondValue + " = " + (dFirstValue - dSecondValue));
            System.out.println(dFirstValue + " * " + dSecondValue + " = " + (dFirstValue * dSecondValue));
            System.out.println(dFirstValue + " / " + dSecondValue + " = " + (dFirstValue / dSecondValue));

        } catch (InputMismatchException e) {
            System.out.println("Please enter Double value or use correct format. After try again");
            System.exit(-1);
        }
    }
}

