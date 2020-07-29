package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_3;

class Transaction {
    private final String owner;
    private final int amount;
    private TransactionType transactionType;

    public Transaction(String owner, int amount, TransactionType transactionType) {
        this.owner = owner;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }
}
