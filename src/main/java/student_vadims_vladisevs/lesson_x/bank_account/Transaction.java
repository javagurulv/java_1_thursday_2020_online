package student_vadims_vladisevs.lesson_x.bank_account;

class Transaction {

    private String owner;
    private int amount;
    private TransactionType transactionType;


    public Transaction(String owner, int amount, TransactionType transactionType){
        this.owner = owner;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public Transaction(int amount, TransactionType transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isDeposit(){
        return transactionType.equals(TransactionType.DEPOSIT);
    }

    public boolean isWithdrawal(){
        return transactionType.equals(TransactionType.WITHDRAWAL);
    }

}
