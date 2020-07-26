package student_aleksey_kodin.lessonx.part_2_expense_analyser.task_21;

class BankAccountMaxBalanceFinder {
    public int find(BankAccount bankAccount) {
        int maxBalance = 0;
        int currentTransaction = 0;
        Transaction[] transactions = bankAccount.getTransactions();

        for (Transaction simpleTransaction : transactions) {
            if (simpleTransaction.isDeposit()) {
                currentTransaction += simpleTransaction.getAmount();
            }
            if (simpleTransaction.isWithdrawal()) {
                currentTransaction -= simpleTransaction.getAmount();
            }
            if (currentTransaction > maxBalance) {
                maxBalance = currentTransaction;
            }
        }
        return maxBalance;
    }
}
