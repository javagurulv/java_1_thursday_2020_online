package student_dmitrijs_visuns.homeworks.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe();
        System.out.println("Haha, I know your PIN: " + safe.pinCode);
        System.out.println("There's money - " + safe.moneyAmountInSafe);

        safe.pinCode = 7777;
        System.out.println("Changed your PIN to " + safe.pinCode);

        safe.moneyAmountInSafe = 0.0;
        System.out.println("Now there's " + safe.moneyAmountInSafe + " money in safe.");


    }

}
