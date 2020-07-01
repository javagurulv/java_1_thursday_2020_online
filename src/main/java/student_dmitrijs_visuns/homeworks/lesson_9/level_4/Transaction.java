package student_dmitrijs_visuns.homeworks.lesson_9.level_4;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    String getTraderFullName() {
        return trader.getFullName();
    }

    String getTraderCity() {
        return trader.getCity();
    }

    String getTraderCountry() {
        return trader.getCountry();
    }

    public int getAmount() {
        return amount;
    }


}
