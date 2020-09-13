package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

import java.util.Objects;

class Transaction {

    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;

    public Transaction(int amount) {
        this.amount = amount;
        this.transactionType = TransactionType.DEPOSIT;
        this.expenseCategory = null;
    }

    public Transaction(int amount, ExpenseCategory expenseCategory) {
        this.amount = amount;
        this.transactionType = TransactionType.WITHDRAWAL;
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

    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                transactionType == that.transactionType &&
                expenseCategory == that.expenseCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, transactionType, expenseCategory);
    }
}
