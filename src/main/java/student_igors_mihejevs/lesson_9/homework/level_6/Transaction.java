package student_igors_mihejevs.lesson_9.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

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

    @Override
    public String toString() {
        return "Transaction = {"
                + "trader = " + this.trader + ", "
                + "amount = " + this.amount
                + "}";
    }
}
