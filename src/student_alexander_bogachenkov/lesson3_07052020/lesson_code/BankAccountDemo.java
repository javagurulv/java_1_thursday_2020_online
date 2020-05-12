package student_alexander_bogachenkov.lesson3_07052020.lesson_code;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Alexander");
        bankAccount1.addMoney(1000);
        bankAccount1.addMoney(1000);
        bankAccount1.removeMoney(500);
        bankAccount1.addMoney(1000);

        bankAccount1.printStatusToConsole();

    }
}
