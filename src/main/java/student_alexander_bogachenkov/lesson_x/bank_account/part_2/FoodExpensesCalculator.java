package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

import java.util.Arrays;
import java.util.stream.Stream;

class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        Transaction[] allTransactions = bankAccount.getTransactions();
        Transaction[] withdrawalTransactions = getWithdrawalTransactions(allTransactions);
        Transaction[] foodWithdrawalTransactions = getFoodWithdrawalTransactions(withdrawalTransactions);
        return getExpensesAmount(foodWithdrawalTransactions);
    }

    private Transaction[] getWithdrawalTransactions(Transaction[] allTransactions) {
        Stream<Transaction> transactionStream = Arrays.stream(allTransactions);
        return transactionStream
                .filter(transaction -> transaction.getTransactionType().equals(TransactionType.WITHDRAWAL))
                .toArray(Transaction[]::new);
    }

    private Transaction[] getFoodWithdrawalTransactions(Transaction[] withdrawalTransactions) {
        Stream<Transaction> transactionStream = Arrays.stream(withdrawalTransactions);
        return transactionStream
                .filter(transaction -> transaction.getExpenseCategory().equals(ExpenseCategory.FOOD))
                .toArray(Transaction[]::new);
    }

    private int getExpensesAmount(Transaction[] foodWithdrawalTransactions) {
        int result = 0;
        for (Transaction transaction : foodWithdrawalTransactions) {
            result += transaction.getAmount();
        }
        return result;
    }

}