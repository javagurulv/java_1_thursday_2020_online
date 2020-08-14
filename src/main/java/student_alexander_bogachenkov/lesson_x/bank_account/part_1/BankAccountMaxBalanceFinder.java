package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

class BankAccountMaxBalanceFinder {

    public int find(BankAccount bankAccount) {
        int maxBalance = 0;
        for (Transaction trn : bankAccount.getTransactions()) {
            if (trn.getAmount() > maxBalance) {
                maxBalance = trn.getAmount();
            }
        }
        return maxBalance;
    }

}