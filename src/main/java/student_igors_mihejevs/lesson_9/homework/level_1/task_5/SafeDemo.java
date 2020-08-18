package student_igors_mihejevs.lesson_9.homework.level_1.task_5;

public class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe("qwerty", 1000);

        System.out.println("Money in safe = " + safe.money + "\n");

        safe.putMoney("incorrect password", 500);
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        safe.putMoney("qwerty", 500);
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getAllMoney("incorrect password"));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getAllMoney("qwerty"));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        safe.putMoney("qwerty", 1500);
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getMoney("incorrect password", 500));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getMoney("qwerty", 500));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getMoney("qwerty", 2500));
        System.out.println("Money in safe after transaction = " + safe.money);
    }

}
