package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_22;

class Transaction {
    private final String owner;
    private final int amount;
    private final TransactionType transactionType;
    private ExpenseCategory expenseCategory = null;

    public Transaction(String owner, int amount) {
        this.owner = owner;
        this.amount = amount;
        this.transactionType = TransactionType.DEPOSIT;
    }

    public Transaction(String owner, int amount,ExpenseCategory expenseCategory) {
        this.owner = owner;
        this.amount = amount;
        this.transactionType = TransactionType.WITHDRAWAL;
        this.expenseCategory = expenseCategory;
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isDeposit() {
        return transactionType.name().equals("DEPOSIT");
    }

    public boolean isWithdrawal() {
        return transactionType.name().equals("WITHDRAWAL");
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}
