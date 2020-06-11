package student_diana_miranovica.lesson2.day_3;

import java.util.Scanner;

 class CircleRadius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            double pi = Math.PI;
            System.out.println("Enter the radius please: ");
            double rad = s.nextDouble();
            double area = (pi * rad * rad);
            double perimeter = (2 * pi * rad);

            System.out.println("Area is "+ area);
            System.out.println("Perimeter is " + perimeter);
    }
}
