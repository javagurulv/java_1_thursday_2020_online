package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner,
                       int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
