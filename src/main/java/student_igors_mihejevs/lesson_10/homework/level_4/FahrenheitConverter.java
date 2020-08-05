package student_igors_mihejevs.lesson_10.homework.level_4;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature * 1.8 + 32);
    }

}
