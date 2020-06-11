package student_edgars_lukjanskis.lession_3;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Edgar");

        int money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        bankAccount.printStatusToConsole();

    }
}
