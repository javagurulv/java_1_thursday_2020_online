package student_oleg_ivanov.lesson9.day1.task4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.moneyAmountInSafe = 200;
        safe.pin = 1234;
        System.out.println("Pin code " + safe.pin + ": Money in safe "+ safe.moneyAmountInSafe);
    }

}
