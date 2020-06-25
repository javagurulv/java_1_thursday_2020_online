package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_20;

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

    public int getAmount() {
        return amount;
    }

    public String getTraderCity() {
        return trader.getCity();
    }

    public String getTraderCountry() {
        return trader.getCountry();
    }
}