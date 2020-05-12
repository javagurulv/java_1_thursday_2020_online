package student_arturs_ragausks.lesson_2.homeworks.day3;

import java.util.Scanner;

class CircleRadius {

    public static void main(String[] args){

        Scanner scanner = new Scanner( System.in );

        float pi = (float) Math.PI;
        System.out.println("Tipe radius : ");
        float radius = scanner.nextFloat();
        System.out.println ("Circle area : " + pi * radius * radius);
        System.out.println ("Circle perimeter : " + 2 * pi * radius);



    }
}
