package student_oleg_ivanov.lesson3;

class BankAccountDemo {
    public static void main (String[] args) {
        BankAccount bankAccount = new BankAccount("Olegs");
        double money = bankAccount.addMoney(200);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(40);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(100);
        System.out.println("Money = " + money);
        money = bankAccount.addMoney(350);
        System.out.println("Money = " + money);
        System.out.println();

        bankAccount.printStatusToConsole();
    }

}
