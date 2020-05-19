package student_aleksey_kodin.lesson4.day1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter number between 1 and 7 : ");
            int day = new Scanner(System.in).nextInt();

            System.out.println("If use 'case' operator:");
            System.out.println( convertNumberToDayOfTheWeek(day) + "\n");
            System.out.println("If use Array:");
            System.out.println(useArray(day) + "\n");
            System.out.println("If use List:");
            System.out.println(useList(day) + "\n");
            System.out.println("If use 'if' operator:");
            System.out.println(useIfOperator(day));

        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value between 1 and 7. And try again");
            System.exit(-1);
        }
    }
    static String  convertNumberToDayOfTheWeek(int dayOfWeek) {
        return switch (dayOfWeek) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
            default -> "not day of week";
        };
    }
    static String useArray(int dayOfWeek) {
        final String[] dayOfWeekValue = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if ((dayOfWeek >= 1) && (dayOfWeek <= 7)) {
            return dayOfWeekValue[dayOfWeek - 1];
        }
        return "not day of week";
    }
    static String useList(int dayOfWeek) {
        final List<String> dayOfWeekValue = List.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");

        if ((dayOfWeek >= 1) && (dayOfWeek <= 7)) {
            return dayOfWeekValue.get(dayOfWeek - 1);
        }
        return "not day of week";
    }
    static String useIfOperator(int dayOfWeek) {
        if(dayOfWeek == 1) return "Monday";
            else if(dayOfWeek == 2) return "Tuesday";
                else if(dayOfWeek == 3) return "Wednesday";
                    else if(dayOfWeek == 4) return "Thursday";
                        else if(dayOfWeek == 5) return "Friday";
                            else if(dayOfWeek == 6) return "Saturday";
                                else if(dayOfWeek == 7) return "Sunday";
        return "not day of week";
    }
}