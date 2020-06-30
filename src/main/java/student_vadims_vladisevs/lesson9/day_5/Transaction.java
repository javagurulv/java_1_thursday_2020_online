package student_vadims_vladisevs.lesson9.day_5;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount){
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
