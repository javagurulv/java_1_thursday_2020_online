package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_10;

class BankAccount {
    private final Transaction[] transactions;

    public BankAccount(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }
}
