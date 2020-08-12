package student_vadims_vladisevs.lesson_x.bank_account;

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount,expenseCategory);
    }

}
