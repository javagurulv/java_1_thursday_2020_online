package student_aleksey_kodin.lessonx.part_2_expense_analyser.task_20;

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
