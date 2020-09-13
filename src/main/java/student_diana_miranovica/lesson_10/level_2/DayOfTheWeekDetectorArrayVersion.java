package student_diana_miranovica.lesson_10.level_2;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    private String[] daysOfTheWeek = {"Please input integer number between 1 and 7",
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
