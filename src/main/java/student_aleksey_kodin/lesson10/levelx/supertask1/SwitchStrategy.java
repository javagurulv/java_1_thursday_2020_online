package student_aleksey_kodin.lesson10.levelx.supertask1;

class SwitchStrategy implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        return new DayOfTheWeekDetectorCaseVersion().detectDayNameSwitch(number);
    }
}

class IfStrategy implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        return new DayOfTheWeekDetectorIfVersion().detectDayNameIf(number);
    }
}

class ArrayStrategy implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        return new DayOfTheWeekDetectorArrayVersion().detectDayNameArray(number);
    }
}
