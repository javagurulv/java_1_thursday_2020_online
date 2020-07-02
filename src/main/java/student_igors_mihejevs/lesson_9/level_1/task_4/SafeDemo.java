package student_igors_mihejevs.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();

        safe.pin = "0000";
        safe.moneyInSafe = 100000;
        System.out.println("PIN code = " + safe.pin + "\n" +
                "Money in safe = " + safe.moneyInSafe);

    }

}
