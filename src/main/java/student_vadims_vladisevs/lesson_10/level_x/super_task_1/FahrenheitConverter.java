package student_vadims_vladisevs.lesson_10.level_x.super_task_1;

class FahrenheitConverter implements Strategy {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
