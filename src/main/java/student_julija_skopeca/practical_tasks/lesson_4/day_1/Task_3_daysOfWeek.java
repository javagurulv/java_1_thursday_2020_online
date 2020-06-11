package student_julija_skopeca.practical_tasks.lesson_4.day_1;

import java.util.Scanner;

class Task_3_daysOfWeek {

    public static void main(String[] args) {

        System.out.println("Please enter a number from 1 to 7");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        switch (enteredNumber) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }

            default: System.out.println("Please enter a number from 1 to 7");
        }
    }
}
