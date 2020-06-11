package student_oleg_ivanov.lesson2.homeWork.day3;

import java.util.Scanner;

class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        //get radius number from user
        System.out.println("Please enter radius of circle:");
        Scanner myInput = new Scanner(System.in);
        double circleRadius = myInput.nextDouble();

        //get result area and perimeter of circle
        double perimeter = circleRadius * Math.PI * 2;
        double area = circleRadius * circleRadius * Math.PI;

        //give result fot user
        System.out.println("Perimeter of circle = " + perimeter);
        System.out.println("Area of circle = " + area);
    }
}
