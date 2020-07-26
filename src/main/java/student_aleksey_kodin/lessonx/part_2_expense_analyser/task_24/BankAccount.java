package student_aleksey_kodin.lessonx.part_2_expense_analyser.task_24;

class BankAccount {
    private final Transaction[] transactions;
    private int creditLimit = 0;

    public BankAccount(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public BankAccount(Transaction[] transactions, Integer creditLimit) {
        this.transactions = transactions;
        this.creditLimit = creditLimit;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
