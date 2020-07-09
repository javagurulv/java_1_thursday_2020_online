package student_vadims_vladisevs.lesson_10.level_4.task_11;

class CelsiusToFahrenheitConverter implements Converter {


    @Override
    public double convert(double celsius) {
        return ((celsius * (9.0 / 5.0)) + 32);
    }
}
