package student_julija_skopeca.practical_tasks.lesson_9.level_5;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
    public String getTraderName() {
        return trader.getFullName();
    }
    public int getTardeAmount() {return amount;}
    public String getTarderCity() {return trader.getCity();}
    public String getTarderState() {return trader.getState();}
}