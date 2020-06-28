package student_aleksey_kodin.lesson10.levelx.supertask1;

class DayOfTheWeekDetectorArrayVersion {
    public String detectDayNameArray(int number) {
        final String[] dayOfWeekValue = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if ((number >= 0) && (number <= 6)) {
            return dayOfWeekValue[number];
        }
        return "not day of week";
    }
}
