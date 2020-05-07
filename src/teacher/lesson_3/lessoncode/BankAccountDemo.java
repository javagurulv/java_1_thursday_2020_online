package teacher.lesson_3.lessoncode;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor");
        bankAccount.addMoney(1000);
        bankAccount.addMoney(1000);
        bankAccount.removeMoney(1000);
        bankAccount.removeMoney(1000);

        bankAccount.printStatusToConsole();
    }

}
