package student_vadims_vladisevs.lesson_x.bank_account;

class Transaction {

    private String owner;
    private int amount;
    private TransactionType transactionType;
    private ExpenseCategory expenseCategory;



    public Transaction(int amount) {
        this.transactionType = TransactionType.DEPOSIT;
        this.amount = amount;
        this.expenseCategory = null;
    }

    public Transaction(int amount, ExpenseCategory expenseCategory) {
        this.transactionType = TransactionType.WITHDRAWAL;
        this.amount = amount;
        this.expenseCategory = expenseCategory;
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

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}
