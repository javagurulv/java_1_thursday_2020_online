package student_diana_miranovica.lesson6.home_works.day_1.task_2;

import java.util.Scanner;

 class DayOfTheWeekDetector {

    String detectDayName(int daysOfWeek){
        return switch (daysOfWeek){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please enter valid number between 1 to 7";
        };
    }

}
