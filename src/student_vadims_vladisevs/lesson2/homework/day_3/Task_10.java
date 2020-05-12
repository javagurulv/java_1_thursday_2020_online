package student_vadims_vladisevs.lesson2.homework.day_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter radius :");
        double radius = scr.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
