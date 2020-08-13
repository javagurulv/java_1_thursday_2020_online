package student_julija_skopeca.practical_tasks.lesson_10.level_4.task_11;

class CoverterToKelvin implements TemperatureConvector {

    @Override
    public double covert(double celsius){
        return 1.8 * celsius + 32;
    }
}
