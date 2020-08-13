package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

class Transaction {

    private String fullName;
    private int amount;
    private TransactionType transactionType;

    public Transaction(int amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
