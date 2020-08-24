package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

import java.util.ArrayList;
import java.util.List;

class FoodExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        Transaction[] allTransactions = bankAccount.getTransactions();
        List<Transaction> withdrawalTransactions = getWithdrawalTransactions(allTransactions);
        List<Transaction> foodWithdrawalTransactions = getFoodWithdrawalTransactions(withdrawalTransactions);
        return getExpensesAmount(foodWithdrawalTransactions);
    }

    private List<Transaction> getWithdrawalTransactions(Transaction[] transactions) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                result.add(transaction);
            }
        }
        return result;
    }

    private List<Transaction> getFoodWithdrawalTransactions(List<Transaction> transactions) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getExpenseCategory() == ExpenseCategory.FOOD) {
                result.add(transaction);
            }
        }
        return result;
    }

    private int getExpensesAmount(List<Transaction> transactions) {
        int result = 0;
        for (Transaction transaction : transactions) {
            result += transaction.getAmount();
        }
        return result;
    }

}