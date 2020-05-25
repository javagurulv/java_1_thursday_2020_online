package student_vadim_sokolenko.lesson5Code;

class NumberServiceDemo {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int sumResult = service.sumOfEvenNumbersInRange(0, 10);
        System.out.println("Sum result =" + sumResult);
    }
}
