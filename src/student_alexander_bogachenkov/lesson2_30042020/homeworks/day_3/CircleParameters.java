package student_alexander_bogachenkov.lesson2_30042020.homeworks.day_3;

import java.util.Scanner;

class CircleParameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scanner.nextFloat();
        System.out.println("Circle perimeter is " + 2 * 3.1415926535897932 * radius);
        System.out.println("Circle area is " + 0.25 * 3.1415926535897932 * (2 * radius)*(2 * radius));
    }
}
