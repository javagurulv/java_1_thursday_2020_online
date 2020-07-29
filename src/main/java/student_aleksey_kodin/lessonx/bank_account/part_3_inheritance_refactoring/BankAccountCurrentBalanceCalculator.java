package student_aleksey_kodin.lessonx.bank_account.part_3_inheritance_refactoring;

public class BankAccountCurrentBalanceCalculator {

    public int calculate(BankAccount bankAccount) {
        int currentBalance = 0;
        Transaction[] transactions = bankAccount.getTransactions();

        for (Transaction simpleTransaction : transactions) {
            if (simpleTransaction.isDeposit()) {
                currentBalance += simpleTransaction.getAmount();
            }
            if (simpleTransaction.isWithdrawal()) {
                currentBalance -= simpleTransaction.getAmount();
            }
        }
        return currentBalance;
    }
}
