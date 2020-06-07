package student_julija_skopeca.practical_tasks.lesson_2.day_3;

import java.util.Scanner;

 class Task_10_circle {

    public static void main(String[] args) {

        System.out.println("Please enter a radius");

        Scanner myInput = new Scanner(System.in);

        double radius = myInput.nextDouble();

        System.out.println("Radius =  " + radius);
        System.out.println("Perimeter is = " + (2*Math.PI*radius));
        System.out.println("Area is = " + (Math.PI*Math.pow(radius,2)));
    }
}
