package student_aleksey_kodin.lesson2.day3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

class Task_10 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter  radius value: ");
            double dRadius = new Scanner(System.in).nextDouble();

            System.out.println("Perimeter is = " + 2 * Math.PI * dRadius);
            System.out.println("Area is = " +  Math.PI * dRadius * dRadius);

        } catch (InputMismatchException e) {
            System.out.println("Please enter Double value or use correct format. After try again");
            System.exit(-1);
        }
    }
}
