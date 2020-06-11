package student_diana_miranovica.lesson4.homeworks.day_2;
//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль наименьшее из них.
import java.util.Scanner;

 class Task6LowerValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press first integer");
        int firstValue = scanner.nextInt();
        System.out.println("Press second integer");
        int secondValue = scanner.nextInt();

        System.out.println("Your lower value is "+ Math.min(firstValue,secondValue));
    }
}
