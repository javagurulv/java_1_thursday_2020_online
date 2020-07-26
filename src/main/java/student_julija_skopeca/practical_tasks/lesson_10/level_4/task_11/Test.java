package student_julija_skopeca.practical_tasks.lesson_10.level_4.task_11;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.CoverterToFahrenheit();
        test.CoverterToKelvin();
    }

    public void CoverterToFahrenheit() {
        TemperatureConvector convertor = new CoverterToFahrenheit();
        double result = convertor.covert(10);

        if (result == 283.15) {
            System.out.println("CoverterToFahrenheit test - ok");
        } else {
            System.out.println("CoverterToFahrenheit test - fail");}
    }

    public void CoverterToKelvin() {
        TemperatureConvector convertor = new CoverterToKelvin();
        double result = convertor.covert(10);

        if (result == 50) {
            System.out.println("CoverterToKelvin test - ok");
        } else {
            System.out.println("CoverterToKelvin test - fail");}
    }
}
