package student_aleksey_kodin.lesson10.levelx.supertask1;

class DayOfTheWeekDetectorCaseVersion {
    public String detectDayNameSwitch(int number) {
        return switch (number) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "not day of week";
        };
    }
}
