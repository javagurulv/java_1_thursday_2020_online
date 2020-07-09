package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_4.task_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}