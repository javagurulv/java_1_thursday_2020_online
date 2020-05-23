package student_aleksey_kodin.lesson6.day1.task_2;

import java.util.Scanner;

class DayOfTheWeekDetector {
    String detectDayName(int dayOfWeek) {
            return switch (dayOfWeek) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Please input a valid number between 1 and 7";
            };
    }
}

