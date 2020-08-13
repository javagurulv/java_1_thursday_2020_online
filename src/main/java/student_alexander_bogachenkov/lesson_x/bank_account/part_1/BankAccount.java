package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

class BankAccount {

    private String owner;
    private Transaction[] transactions;

    public BankAccount(String owner, Transaction[] transactions) {
        this.owner = owner;
        this.transactions = transactions;
    }

    public String getOwner() {
        return owner;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

}