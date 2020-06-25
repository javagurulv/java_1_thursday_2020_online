package student_aleksey_kodin.lesson9.level1.task_5;

class Demo {

    public static void main(String[] args) {
        Safe safe = new Safe(12345, 150);

       int safeSum = safe.getBalance(12345);
       printInfo(safeSum);
       if (safe.getMoney(12345,50)) {
           System.out.println("Операция <getMoney> прошла успешна");
       }
        int safeSumAfterGetMoney = safe.getBalance(12345);
        printInfo(safeSumAfterGetMoney);

        if (safe.putMoney(12345,100)) {
            System.out.println("Операция <putMoney> прошла успешна");
        }
        int safeSumAfterPutMoney = safe.getBalance(12345);
        printInfo(safeSumAfterPutMoney);
    }

    private static void printInfo(int safeSum) {
        if (safeSum == -1) {
            System.out.println("Неверый PIN код");
        } else {
            System.out.println("Сумма в сейфе - " + safeSum);
        }
    }
}
