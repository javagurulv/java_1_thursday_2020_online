package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        int maxBalance = 0;
        int currentBalance = 0;
        for (Transaction trn : bankAccount.getTransactions()) {
            if (trn.isDeposit()) {
                currentBalance += trn.getAmount();
            } else if (trn.isWithdrawal()) {
                currentBalance -= trn.getAmount();
            }
            if (currentBalance > maxBalance) {
                maxBalance = currentBalance;
            }
        }
        return maxBalance;
    }

}