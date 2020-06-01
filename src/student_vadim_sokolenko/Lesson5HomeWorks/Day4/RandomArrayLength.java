package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Random;
import java.util.Scanner;

class RandomArrayLength {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arreyLengthFromConsole = scanner.nextInt();
        int[] numbers = new int[arreyLengthFromConsole];

		// обычно переменные цикла называют: i, j, ...
        for (int count = 0; count < arreyLengthFromConsole; count++) {
            Random random = new Random();
            numbers [count] = random.nextInt(50);
        }

		// обычно переменные цикла называют: i, j, ...
        for (int count = 0; count < arreyLengthFromConsole; count++) {
            System.out.println("[" + count + "]" + " numbers in an array = " + numbers[count]);

        }
    }
}
