package student_igors_mihejevs.lesson_2.homework.level_3;

// This is a Java program to print the area and perimeter of a circle
// area = pi * radius * radius
// perimeter = 2 * pi * radius

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        double circle, perimeter;

        System.out.print("Enter radius of a circle : ");
        double circleRadius = myInput.nextDouble();

        circle = Math.PI * circleRadius * circleRadius;
        perimeter = 2 * Math.PI * circleRadius;

        System.out.println("---------------------------------");
        System.out.println("The area of a circle      = " + circle);
        System.out.println("The perimeter of a circle = " + perimeter);
    }
}