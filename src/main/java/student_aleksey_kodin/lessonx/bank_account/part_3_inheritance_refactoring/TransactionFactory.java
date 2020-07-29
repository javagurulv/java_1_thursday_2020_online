package student_aleksey_kodin.lessonx.bank_account.part_3_inheritance_refactoring;

class TransactionFactory {
    public static Transaction createDepositTransaction(String owner, int amount) {
        return new Transaction(owner, amount);
    }

    public static Transaction createWithdrawalTransaction(String owner, int amount, ExpenseCategory expenseCategory) {
        return new Transaction(owner, amount, expenseCategory);
    }
}
