package student_aleksey_kodin.lesson10.level2.task_5;

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
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

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
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

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        final String[] dayOfWeekValue = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if ((number >= 0) && (number <= 6)) {
            return dayOfWeekValue[number];
        }
        return "not day of week";
    }
}
