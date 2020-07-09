package student_vadims_vladisevs.lesson_10.level_4.task_11;

class CelsiusToKelvinConverter implements Converter{

    private final double KELVIN_CONST = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + KELVIN_CONST;
    }
}
