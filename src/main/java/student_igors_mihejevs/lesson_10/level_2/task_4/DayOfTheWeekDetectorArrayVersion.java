package student_igors_mihejevs.lesson_10.level_2.task_4;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] dayNames = {"Please input a valid number between 1 and 7", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {

        for (int i = 0; i < dayNames.length; i++) {
            if (number == i) {
                return dayNames[i];
            }
        } return dayNames [0];
    }

}
