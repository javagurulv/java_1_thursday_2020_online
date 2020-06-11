package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Scanner;

class ArrayLength {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arreyLengthFromConsole = scanner.nextInt();
        int[] count = new int[arreyLengthFromConsole];

		// обычно переменные цикла называют: i, j, ...
        for (int value = 0; value < arreyLengthFromConsole; value++) {
            System.out.println("Enter some count" + "[" + value + "] for array");
            count[value] = scanner.nextInt();
        }

		// обычно переменные цикла называют: i, j, ...
        for (int value = 0; value < arreyLengthFromConsole; value++) {
            System.out.println("[" + value + "]" + " numbers in an array = " + count[value]);

        }
    }
}
