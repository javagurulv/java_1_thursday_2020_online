package student_diana_miranovica.lesson_9.homeworks.day_4.task_19;


public class Transaction {

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
}
