package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_17;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public String getTraderFullName() {
        return trader.getFullName();
    }

}