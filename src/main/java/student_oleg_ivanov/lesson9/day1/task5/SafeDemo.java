package student_oleg_ivanov.lesson9.day1.task5;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1234, 200);
        System.out.println("Money in safe " + safe.getMoneyAmountInSafe());

        safe.getMoneyFromSafe(1234, 100);
        System.out.println("Money in Safe " + safe.getMoneyAmountInSafe());

        safe.putMoneyToSafe(1234, 50);
        System.out.println("Money in safe " + safe.getMoneyAmountInSafe());
    }
}
