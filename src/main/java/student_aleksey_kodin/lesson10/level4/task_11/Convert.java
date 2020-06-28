package student_aleksey_kodin.lesson10.level4.task_11;

class Convert implements CelsiusConvert {
    @Override
    public double convert(Celsius celsius, Kelvin kelvin) {
        kelvin.setKelvin(celsius.getCelsius() + 273.15);
        return kelvin.getKelvin();
    }

    @Override
    public double convert(Kelvin kelvin, Celsius celsius) {
        celsius.setCelsius(kelvin.getKelvin() - 273.15);
        return celsius.getCelsius();
    }

    @Override
    public double convert(Celsius celsius, Fahrenheit fahrenheit) {
        fahrenheit.setFahrenheit(celsius.getCelsius() * 1.8 + 32);
        return fahrenheit.getFahrenheit();
    }

    @Override
    public double convert(Fahrenheit fahrenheit, Celsius celsius) {
        celsius.setCelsius((fahrenheit.getFahrenheit() - 32) * 5 / 9);
        return celsius.getCelsius();
    }
}

class Demo {
    public static void main(String[] args) {
        Convert convert = new Convert();
        Celsius celsius = new Celsius();
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();
        celsius.setCelsius(-10);

        System.out.println("Convert Celsius: " + celsius.getCelsius() + " to Kelvin: " + convert.convert(celsius, kelvin));
        System.out.println("Convert Kelvin: " + kelvin.getKelvin() + " to Celsius: " + convert.convert(kelvin, celsius));
        System.out.println("Convert Celsius: " + celsius.getCelsius() + " to Fahrenheit: " + convert.convert(celsius, fahrenheit));
        System.out.println("Convert Fahrenheit: " + fahrenheit.getFahrenheit() + " to Celsius: " + convert.convert(fahrenheit, celsius));
    }
}
