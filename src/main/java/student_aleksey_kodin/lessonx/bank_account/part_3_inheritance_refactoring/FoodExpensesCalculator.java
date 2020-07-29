package student_aleksey_kodin.lessonx.bank_account.part_3_inheritance_refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FoodExpensesCalculator {
    public int calculateExpensesAmount(BankAccount bankAccount) {
        Transaction[] transactions = bankAccount.getTransactions();

        List<Transaction> withdrawalTransactions = createWithdrawalTransactions(transactions);

        List<Transaction> withdrawalFood = withdrawalTransactions.stream().filter(t ->
                t.getExpenseCategory() == ExpenseCategory.FOOD).collect(Collectors.toList());

        return withdrawalFood.stream().mapToInt(Transaction::getAmount).sum();
    }

    private List<Transaction> createWithdrawalTransactions(Transaction[] transactions) {
        List<Transaction> withdrawalTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }
        return withdrawalTransactions;
    }
}
