package student_dmitrijs_visuns.homeworks.lesson_6.day_1.task_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    int getNumber() {

        Scanner myInput = new Scanner(System.in);
        System.out.println("Input integer number between 1 and 7 : ");
        int number = myInput.nextInt();
        return number;

    }


    String detectDayName(int number) {
        String dayName = null;
        if ((number < 1) || (number > 7)) {
            dayName = "Invalid day of the week number";
        } else {
            switch (number) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3: dayName = "Wednesday";
                    break;
                case 4: dayName = "Thursday";
                    break;
                case 5: dayName = "Friday";
                    break;
                case 6: dayName = "Saturday";
                    break;
                case 7: dayName = "Sunday";
                    break;
            }
        }
        return dayName;
    }
}