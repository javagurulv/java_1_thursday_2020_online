package student_dmitrijs_visuns.homeworks.lesson_4.day_1;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7: ");
        int inputNumber = sc.nextInt();

        switch (inputNumber) {

            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            }
            case 7: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("Вы ввели неверное число!");
                break;
            }

        }

    }

}
