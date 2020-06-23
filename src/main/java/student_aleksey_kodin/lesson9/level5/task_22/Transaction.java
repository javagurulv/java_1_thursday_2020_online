package student_aleksey_kodin.lesson9.level5.task_22;

public class Transaction {

    private final Trader trader;
    private final int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
