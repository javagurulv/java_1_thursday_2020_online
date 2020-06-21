package student_aleksey_kodin.lesson9.level1.task_4;

class Demo {

    public static void main(String[] args) {
        Safe safe = new Safe(12345, 150);

        System.out.println("Мы можем получить данные используя методы класса Safe");
        int safeSum = safe.getBalance(safe.getPinNumber());
        printInfo(safeSum);
        System.out.println("---------------------------------------");

        /* Если поля класса имеют модификатор public. То можно создать копию этих полей и внести изменнеия в данные
        без контроля */

        int copyPin = safe.pinNumber;
        boolean changePinStatus = safe.changePin(copyPin, 54321);
        if (changePinStatus) {
            System.out.println("PIN код изменён");
        }
        System.out.println("Поле pinNumber - " + safe.getPinNumber());
        int safeSumAfterChangePin = safe.getBalance(safe.getPinNumber());
        printInfo(safeSumAfterChangePin);
    }

    private static void printInfo(int safeSum) {
        if (safeSum == -1) {
            System.out.println("Неверый PIN код");
        } else {
            System.out.println("Сумма в сейфе - " + safeSum);
        }
    }
}
