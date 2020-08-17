package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class BankAccountMinBalanceFinder {

    public int find(BankAccount bankAccount) {
        int minBalance = 0;
        int currentBalance = 0;
        for (Transaction trn : bankAccount.getTransactions()) {
            if (trn.isDeposit()) {
                currentBalance += trn.getAmount();
            } else if (trn.isWithdrawal()) {
                currentBalance -= trn.getAmount();
            }
            if (currentBalance < minBalance) {
                minBalance = currentBalance;
            }
        }
        return minBalance;
    }

}
