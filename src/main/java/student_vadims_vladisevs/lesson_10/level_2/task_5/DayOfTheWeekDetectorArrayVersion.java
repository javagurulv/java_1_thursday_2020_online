package student_vadims_vladisevs.lesson_10.level_2.task_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String[] dayOfWeekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ((number > 0) && (number < 8)) {
            return dayOfWeekArray[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}
