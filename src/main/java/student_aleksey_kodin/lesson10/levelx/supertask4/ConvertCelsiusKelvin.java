package student_aleksey_kodin.lesson10.levelx.supertask4;

class ConvertCelsiusToKelvin implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return convertValue + 273.15;
    }
}

class ConvertKelvinToCelsius implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return convertValue - 273.15;
    }
}

class ConvertCelsiusToFahrenheit implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return convertValue * 1.8 + 32;
    }
}

class ConvertFahrenheitToCelsius implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return (convertValue - 32) * 5 / 9;
    }
}

class ConvertKelvinToFahrenheit implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return (convertValue -273.15) * 9 / 5 + 32;
    }
}

class ConvertFahrenheitToKelvin implements ConvertMethod {

    @Override
    public double convert(double convertValue) {
        return (convertValue - 32) * 5 / 9 + 273.15;
    }
}