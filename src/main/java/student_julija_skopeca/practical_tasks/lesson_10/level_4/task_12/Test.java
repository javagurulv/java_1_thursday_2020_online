package student_julija_skopeca.practical_tasks.lesson_10.level_4.task_12;



class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.CoverterToFahrenheit();
        test.KelvinConverter();
    }

    public void CoverterToFahrenheit(){
        TemperatureConverter convertor = new FahrenheitConverter();
        double result = convertor.convert(10);

        if (result == 283.15) {
            System.out.println("CoverterToFahrenheit test - ok");
        } else {
            System.out.println("CoverterToFahrenheit test - fail");}
    }

    public void KelvinConverter(){
        TemperatureConverter convertor = new KelvinConverter();
        double result = convertor.convert(10);

        if (result == 50) {
            System.out.println("KelvinConverter test - ok");
        } else {
            System.out.println("KelvinConverter test - fail");}
    }
}
