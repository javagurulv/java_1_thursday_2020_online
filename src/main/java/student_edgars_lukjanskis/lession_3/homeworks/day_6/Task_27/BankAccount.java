package student_edgars_lukjanskis.lession_3.homeworks.day_6.Task_27;

class BankAccount {

    private int money;
    private String owner;

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
