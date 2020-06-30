package student_aleksey_kodin.lesson10.levelx.supertask4;

class Convert {
    private final ConvertMethod convertMethod;

    Convert(ConvertMethod convertMethod) {
        this.convertMethod = convertMethod;
    }

    double convertation(double convertValue) {

        return convertMethod.convert(convertValue);
    }
}

class Demo {
    public static void main(String[] args) {
        Convert celsiusToKelvin = new Convert(new ConvertCelsiusToKelvin());
        System.out.println("Convert Celsius 10 to Kelvin - " + celsiusToKelvin.convertation(10));

        Convert celsiusToFahrenheit = new Convert(new ConvertCelsiusToFahrenheit());
        System.out.println("Convert Celsius 10 to Fahrenheit - " + celsiusToFahrenheit.convertation(10));

        Convert fahrenheitToKelvin = new Convert(new ConvertFahrenheitToKelvin());
        System.out.println("Convert Fahrenheit 10 to Kelvin - " + fahrenheitToKelvin.convertation(10));

        Convert fahrenheitToCelsius = new Convert(new ConvertFahrenheitToCelsius());
        System.out.println("Convert Fahrenheit 10 to Celsius - " + fahrenheitToCelsius.convertation(10));

        Convert KelvinToCelsius = new Convert(new ConvertKelvinToCelsius());
        System.out.println("Convert Kelvin 10 to Celsius - " + KelvinToCelsius.convertation(10));

        Convert KelvinToFahrenheit = new Convert(new ConvertKelvinToFahrenheit());
        System.out.println("Convert Kelvin 10 to Fahrenheit - " + KelvinToFahrenheit.convertation(10));
    }
}