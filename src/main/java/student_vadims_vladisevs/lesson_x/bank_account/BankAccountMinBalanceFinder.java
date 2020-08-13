package student_vadims_vladisevs.lesson_x.bank_account;

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        int balance = 0;
        int minBalance = 0;
        Transaction[] allTransactions = bankAccount.getTransactions();

        for (Transaction transaction : allTransactions) {
            if (transaction.isDeposit()) {
                balance += transaction.getAmount();
            }

            if (transaction.isWithdrawal()) {
                balance -= transaction.getAmount();
            }

            if (balance < minBalance) {
                minBalance = balance;
            }
        }

        return minBalance;
    }

}
