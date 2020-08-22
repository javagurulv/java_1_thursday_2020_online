package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class TransactionFactory {

    public static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount);
    }

    public static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, expenseCategory);
    }

}
