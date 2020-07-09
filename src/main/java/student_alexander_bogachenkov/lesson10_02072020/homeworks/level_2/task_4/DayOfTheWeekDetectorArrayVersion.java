package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_2.task_4;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    private String[] daysOfTheWeek = {"Please input a valid number between 1 and 7",
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            if (number == i) {
                return daysOfTheWeek[i];
            }
        }
        return daysOfTheWeek[0];
    }

}
