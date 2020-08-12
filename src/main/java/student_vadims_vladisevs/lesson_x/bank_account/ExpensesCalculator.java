package student_vadims_vladisevs.lesson_x.bank_account;

import java.util.ArrayList;
import java.util.List;

abstract class ExpensesCalculator {

    protected abstract ExpenseCategory getExpenseCategory();

    protected int calculateExpensesAmount(BankAccount bankAccount) {
        Transaction[] transactions = bankAccount.getTransactions();
        List<Transaction> withdrawalTransactions = filterWithdrawalTransactions(transactions);
        ExpenseCategory expenseCategory = getExpenseCategory();
        List<Transaction> withdrawalEntertainmentTransactions = filterTransactionsByExpenseCategory(withdrawalTransactions, expenseCategory);
        return sumTransactionAmount(withdrawalEntertainmentTransactions);
    }

    protected List<Transaction> filterWithdrawalTransactions(Transaction[] transactions) {
        List<Transaction> withdrawalTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactions.add(transaction);
            }
        }
        return withdrawalTransactions;
    }

    protected int sumTransactionAmount(List<Transaction> transactions) {
        int expensesAmount = 0;
        for (Transaction transaction : transactions) {
            expensesAmount = expensesAmount + transaction.getAmount();
        }
        return expensesAmount;
    }

    protected List<Transaction> filterTransactionsByExpenseCategory(List<Transaction> transactions,
                                                                  ExpenseCategory expenseCategory) {
        List<Transaction> filteredTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getExpenseCategory() == expenseCategory) {
                filteredTransactions.add(transaction);
            }
        }
        return filteredTransactions;
    }

}
