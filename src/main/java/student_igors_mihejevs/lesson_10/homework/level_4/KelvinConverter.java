package student_igors_mihejevs.lesson_10.homework.level_4;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature + 273.15);
    }



}
