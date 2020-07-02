package student_igors_mihejevs.lesson_9.level_1.task_5;

public class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe("qwerty", 1000);

        System.out.println("Money in safe = " + safe.money + "\n");

        safe.putMoney("qwerti", 500); //incorrect password
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        safe.putMoney("qwerty", 500); //correct password
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getAllMoney("qwerti"));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getAllMoney("qwerty"));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        safe.putMoney("qwerty", 1500); //correct password
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getMoney("qwerti", 500));
        System.out.println("Money in safe after transaction = " + safe.money + "\n");

        System.out.println("Returned money = " + safe.getMoney("qwerty", 500));
        System.out.println("Money in safe after transaction = " + safe.money);

    }

}
