package student_aleksey_kodin.lesson10.levelx.supertask1;

class DayOfTheWeekDetectorIfVersion  {
    public String detectDayNameIf(int number) {
        if (number == 0) {
            return "Monday";
        } else if (number == 1) {
            return "Tuesday";
        } else if (number == 2) {
            return "Wednesday";
        } else if (number == 3) {
            return "Thursday";
        } else if (number == 4) {
            return "Friday";
        } else if (number == 5) {
            return "Saturday";
        } else if (number == 6) {
            return "Sunday";
        } else {
            return "not day of week";
        }
    }
}
