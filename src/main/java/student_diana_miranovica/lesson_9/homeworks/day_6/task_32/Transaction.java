package student_diana_miranovica.lesson_9.homeworks.day_6.task_32;


class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public String getFullNameFromTrader() {
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
