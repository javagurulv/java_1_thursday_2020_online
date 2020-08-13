package student_vadims_vladisevs.lesson9.day_x.super_task_2;

class Transaction {

    private Trader trader;
    private int amount;

    private Transaction(){
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return   trader +
                ", amount = " + amount;
    }

    public static TransactionBuilder newBuilder(){
        return new Transaction().new TransactionBuilder();
    }

    class TransactionBuilder {

        private TransactionBuilder(){

        }

        public TransactionBuilder addTrader(Trader trader){
            Transaction.this.trader = trader;
            return this;
        }
        public TransactionBuilder addAmount(int amount){
            Transaction.this.amount = amount;
            return this;
        }

        public Transaction build(){
            return Transaction.this;
        }
    }
}
