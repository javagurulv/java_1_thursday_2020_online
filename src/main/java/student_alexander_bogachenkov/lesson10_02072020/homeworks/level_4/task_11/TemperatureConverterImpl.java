package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_4.task_11;

class TemperatureConverterImpl implements TemperatureConverter {

    @Override
    public double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        return temperatureInCelsius * 1.8 + 32;
    }

    @Override
    public double convertCelsiusToKelvin(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }

}
