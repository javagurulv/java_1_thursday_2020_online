package student_vadims_vladisevs.lesson_x.bank_account;

class BankAccount {
    private String owner;
    private Transaction[] transactions;
    private int creditLimit;

    public BankAccount(String owner, int creditLimit, Transaction... transactions){
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.transactions = transactions;
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
