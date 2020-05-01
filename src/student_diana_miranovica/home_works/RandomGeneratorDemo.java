package student_diana_miranovica.home_works;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        double firstNumber = Math.random() * 3;

        System.out.println(firstNumber);

        double secondNumber = 25  + Math.random() * 30;

        System.out.println(secondNumber);

        int thirdNumber = (int) (Math.random() * 3);

        System.out.println(thirdNumber);
    }
}
