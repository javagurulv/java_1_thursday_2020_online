package student_vadims_vladisevs.lesson_x.bank_account;

class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
       int balance = 0;
        Transaction[] allTransactions = bankAccount.getTransactions();

        for (Transaction transaction : allTransactions) {
            if (transaction.isDeposit()) {
                balance += transaction.getAmount();
            }

            if (transaction.isWithdrawal()) {
                balance -= transaction.getAmount();
            }
        }
       return balance;
    }
}
