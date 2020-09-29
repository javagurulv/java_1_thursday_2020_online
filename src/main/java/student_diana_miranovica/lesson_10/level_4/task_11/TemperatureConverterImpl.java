package student_diana_miranovica.lesson_10.level_4.task_11;

public class TemperatureConverterImpl implements TemperatureConverter{

    @Override
    public double converterFromCelsiusToFahrenheit(double temperatureInCelsius){
        return temperatureInCelsius * 1.8 + 32;
    }

    @Override
    public double converterFromCelsiusToKelvin(double temperatureInCelsius){
        return temperatureInCelsius +271.15;
    }
}
