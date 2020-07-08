package student_vadims_vladisevs.lesson_10.level_4.task_11;

class WeatherForecast {

    CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
    CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();

    public void printWeatherForecast(double celsius){
        System.out.println("Temperature in Celsius = " + celsius + " C");
        System.out.println("Temperature in Kelvin = " + celsiusToKelvinConverter.convert(celsius) + " K");
        System.out.println("Temperature in Fahrenheit = " + celsiusToFahrenheitConverter.convert(celsius) + " F");
    }
}
