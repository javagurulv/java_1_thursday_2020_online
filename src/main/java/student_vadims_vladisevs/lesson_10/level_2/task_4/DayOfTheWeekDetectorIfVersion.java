package student_vadims_vladisevs.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {


    @Override
     public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String detectDayNameWithSwitch(int number) {
        return  switch (number) {
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

    @Override
    public String detectDayNameWithArray(int number) {
        String[] dayOfWeekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ((number > 0) && (number < 8)) {
            return dayOfWeekArray[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}