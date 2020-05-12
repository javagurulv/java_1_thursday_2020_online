package student_vladimir_filipov.lesson2_hometasks;

import java.util.Scanner;

class Task10_circleAreaPerimeters {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        double pi = Math.PI;
        System.out.println("Enter the radius : ");
        double rad = myInput.nextDouble();
        double area = (pi * rad * rad);
        double perimeter = (2 * pi * rad);

        System.out.println("Area is "+ area);
        System.out.println("Perimeter is " + perimeter);
    }
}

