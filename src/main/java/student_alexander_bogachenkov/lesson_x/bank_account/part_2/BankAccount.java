package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class BankAccount {

    private String owner;
    private Transaction[] transactions;
    private int creditLimit;

    public BankAccount(String owner, Transaction[] transactions, int creditLimit) {
        this.owner = owner;
        this.transactions = transactions;
        this.creditLimit = creditLimit;
    }

    public String getOwner() {
        return owner;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}