package student_vadims_vladisevs.lesson3.day_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    public String getOwner() {
        return owner;
    }

    public String getMoney() {
        return Integer.toString(money);
    }



}