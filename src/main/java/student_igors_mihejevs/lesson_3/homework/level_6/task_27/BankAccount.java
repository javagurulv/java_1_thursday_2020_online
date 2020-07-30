package student_igors_mihejevs.lesson_3.homework.level_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
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
