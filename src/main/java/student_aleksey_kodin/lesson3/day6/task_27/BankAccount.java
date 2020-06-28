package student_aleksey_kodin.lesson3.day6.task_27;
/* Найти логическую ошибку в коде.
Исправить и запустить программу так, что бы она выводила
на консоль владельца банковского счёта и количество денег.
Менять можно только класс BankAccount. */
class BankAccount {
    private String owner;
    private final int money;

    public BankAccount(String owner,int money) {
        this.owner = owner;
        this.money = money;
    }
    public String getOwner() {
        return owner;
    }
    public String getMoney() {
        return Integer.toString(money);
    }
}
class BankAccountDemo {
        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            String moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + ownerFirstName);
            System.out.println("Money = " + moneyAmount);
        }
}

