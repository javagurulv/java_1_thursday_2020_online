package student_diana_miranovica.lesson5.homeworks.day_4;

import java.util.Random;

class ArrayTask30 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            mas[i] = random.nextInt(100);

        }
        for (int i = 0; i < 4; i++) {
            System.out.println("numbers[" + i + "]" + "  in an array = " + mas[i]);

        }
        for (int i = 0; i < mas.length; i++) {
            int evenValue = mas[i] % 2;
            if (evenValue != 0) {
                System.out.println("Even numbers is - " + mas[i]);
            }
        }

    }
}