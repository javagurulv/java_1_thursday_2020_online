package student_vadim_sokolenko.Lesson2;

import java.util.Scanner;

class Day3task10 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            double pi = Math.PI;

            System.out.print("Enter the radius: ");

            double rad = s.nextDouble();

            double area = (pi * rad * rad);

            double perimeter = (2 * pi * rad);

            System.out.println("Area is "+ area);
            System.out.println("Perimeter is " + perimeter);

    }
}
