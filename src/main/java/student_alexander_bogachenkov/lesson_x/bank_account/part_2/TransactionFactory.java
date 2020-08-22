package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class TransactionFactory {

    static Transaction createDepositTransaction(int amount) {
        return new Transaction(amount, TransactionType.DEPOSIT, null);
    }

    static Transaction createWithdrawalTransaction(int amount, ExpenseCategory expenseCategory) {
        return new Transaction(amount, TransactionType.WITHDRAWAL, expenseCategory);
    }

}
