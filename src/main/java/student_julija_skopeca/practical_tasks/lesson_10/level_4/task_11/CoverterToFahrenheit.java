package student_julija_skopeca.practical_tasks.lesson_10.level_4.task_11;

class CoverterToFahrenheit implements TemperatureConvector{

    @Override
    public double covert(double celsius) {
        return celsius + 273.15;
    }
}
