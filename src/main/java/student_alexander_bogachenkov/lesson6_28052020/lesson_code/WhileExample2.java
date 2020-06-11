package student_alexander_bogachenkov.lesson6_28052020.lesson_code;

import java.util.Scanner;

class WhileExample2 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (sum < 100) {
            sum += number;
            System.out.println("Sum = " + sum);
            number++;
        }
    }
}
