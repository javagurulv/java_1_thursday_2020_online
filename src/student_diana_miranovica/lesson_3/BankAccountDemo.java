package student_diana_miranovica.lesson_3;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Diana Mir");
        int money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(2750);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(100);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1450);
        System.out.println("Money = " + money);

        bankAccount.printStatusToConsole();




    }
}

