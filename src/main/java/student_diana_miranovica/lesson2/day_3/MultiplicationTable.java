package student_diana_miranovica.lesson2.day_3;

import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = s.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + n * i);

        }

    }
}
