package student_dmitrijs_visuns.homeworks.lesson_9.level_1.task_5;

class Safe2Demo {

    public static void main(String[] args) {

        Safe2 safe = new Safe2(1234, 100);

        System.out.println("Money in safe: " + safe.getMoneyAmountInSafe());

        safe.getMoneyFromSafe(1234, 20);

        System.out.println("Money in safe: " + safe.getMoneyAmountInSafe());

        safe.putMoneyInSafe(1234, 200);

        System.out.println("Money in safe: " + safe.getMoneyAmountInSafe());

    }


}
