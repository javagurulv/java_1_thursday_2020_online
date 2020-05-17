package student_vladimir_filipov.lesson3_hometasks.day_6.task_27;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = 1000000;
    }

        public String getOwner() {
        return this.owner;
    }

    public String getMoney() {
        return Integer.toString(money);
    }

}

