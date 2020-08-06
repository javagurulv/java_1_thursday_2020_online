package student_vadims_vladisevs.lesson_x.bank_account;

import java.util.ArrayList;
import java.util.List;

class EntertainmentExpensesCalculator {

    public int calculateExpensesAmount(BankAccount bankAccount) {
        return calculateAmount(bankAccount);
    }

    private int calculateAmount(BankAccount bankAccount){

        List<Transaction> withdrawalTransactions = filterWithdrawalTransactions(bankAccount);
        List<Transaction> withdrawalEntertainmentTransactions = filterEntertainmentTransactions(withdrawalTransactions);

        int foodExpensesAmount = 0;
        for (Transaction transaction : withdrawalEntertainmentTransactions) {
            foodExpensesAmount += transaction.getAmount();
        }

        return foodExpensesAmount;
    }


    private List<Transaction> filterWithdrawalTransactions(BankAccount bankAccount){
        Transaction[] allTransactions = bankAccount.getTransactions();
        List<Transaction> withdrawalTransactions = new ArrayList<>();

        for (Transaction transaction : allTransactions){
            if (transaction.isWithdrawal()){
                withdrawalTransactions.add(transaction);
            }
        }

        return withdrawalTransactions;
    }

    private List<Transaction> filterEntertainmentTransactions(List<Transaction> withdrawalTransactions){
        List<Transaction> withdrawalFoodTransactions = new ArrayList<>();

        for (Transaction transaction : withdrawalTransactions){
            if (transaction.getExpenseCategory().equals(ExpenseCategory.ENTERTAINMENT)){
                withdrawalFoodTransactions.add(transaction);
            }
        }

        return withdrawalFoodTransactions;
    }

}
