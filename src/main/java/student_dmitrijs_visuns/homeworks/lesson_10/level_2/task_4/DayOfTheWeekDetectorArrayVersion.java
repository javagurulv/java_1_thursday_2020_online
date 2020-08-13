package student_dmitrijs_visuns.homeworks.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] daysOfTheWeek = {"Please input a valid number between 1 and 7", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ((number >= 1) && (number <=7)) {
            return daysOfTheWeek[number];
        } else return daysOfTheWeek[0];

    }

}
