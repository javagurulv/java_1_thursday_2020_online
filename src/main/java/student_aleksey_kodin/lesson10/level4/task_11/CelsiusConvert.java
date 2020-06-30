package student_aleksey_kodin.lesson10.level4.task_11;

interface CelsiusConvert {

    double convert(Celsius celsius, Kelvin kelvin);

    double convert(Kelvin kelvin, Celsius celsius);

    double convert(Celsius celsius, Fahrenheit fahrenheit);

    double convert(Fahrenheit fahrenheit,Celsius celsius);
}
