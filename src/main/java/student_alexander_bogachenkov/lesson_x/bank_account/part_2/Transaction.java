package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    public Transaction(int amount, TransactionType transactionType, ExpenseCategory expenseCategory) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean isDeposit() {
        return this.transactionType == TransactionType.DEPOSIT;
    }

    public boolean isWithdrawal() {
        return this.transactionType == TransactionType.WITHDRAWAL;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}
