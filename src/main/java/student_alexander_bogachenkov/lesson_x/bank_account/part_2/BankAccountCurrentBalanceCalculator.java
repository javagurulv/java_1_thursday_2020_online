package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
        int resultBalance = 0;
        for (Transaction trn : bankAccount.getTransactions()) {
            if (trn.isDeposit()) {
                resultBalance += trn.getAmount();
            } else if (trn.isWithdrawal()) {
                resultBalance -= trn.getAmount();
            }
        }
        return resultBalance;
    }

}