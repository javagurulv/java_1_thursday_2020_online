package student_diana_miranovica.lesson_10.level_4.task_12;

public class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {

        return celsiusTemperature + 273.15;
    }
}
