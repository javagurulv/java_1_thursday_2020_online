package student_vadim_sokolenko;

import java.util.Scanner;

public class day3task9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = s.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + n * i);

        }

    }
}


