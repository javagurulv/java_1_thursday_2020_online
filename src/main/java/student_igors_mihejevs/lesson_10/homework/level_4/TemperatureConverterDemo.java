package student_igors_mihejevs.lesson_10.homework.level_4;

public class TemperatureConverterDemo {

    public static void main(String[] args) {

        TemperatureConverter temperatureConverterKelvin = new KelvinConverter();
        TemperatureConverter temperatureConverterFahrenheit = new FahrenheitConverter();
        System.out.println("20 Celsius = " + temperatureConverterKelvin.convert(20)
                            + " Kelvin");
        System.out.println("20 Celsius = " + temperatureConverterFahrenheit.convert(20)
                            + " Fahrenheit");
    }




}
