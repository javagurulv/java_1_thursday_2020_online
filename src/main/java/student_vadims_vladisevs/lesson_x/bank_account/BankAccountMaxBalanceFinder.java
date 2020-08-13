package student_vadims_vladisevs.lesson_x.bank_account;

class BankAccountMaxBalanceFinder {
    public int find(BankAccount bankAccount) {
        int balance = 0;
        int maxBalance = 0;
        Transaction[] allTransactions = bankAccount.getTransactions();

        for (Transaction transaction : allTransactions) {
            if (transaction.isDeposit()) {
                balance += transaction.getAmount();
            }

            if (transaction.isWithdrawal()) {
                balance -= transaction.getAmount();
            }

            if (balance > maxBalance) {
                maxBalance = balance;
            }
        }

        return maxBalance;
    }
}
