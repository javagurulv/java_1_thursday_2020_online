package student_vadims_vladisevs.lesson_10.level_x.super_task_1;

class KelvinConverter implements Strategy {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
