package student_aleksey_kodin.lesson10.level4.task_12;

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
