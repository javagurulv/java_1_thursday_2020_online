package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoodExpensesCalculatorTest {
    FoodExpensesCalculator foodExpensesCalculator = new FoodExpensesCalculator();

    @Test
    public void checkAmountFood_v1() {
        Transaction transaction_1 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = foodExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 1000);
    }

    @Test
    public void checkAmountFood_v2() {
        Transaction transaction_1 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_2 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = foodExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 2000);
    }

    @Test
    public void checkAmountFood_v3() {
        Transaction transaction_1 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_2 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_3 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = foodExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 3000);
    }

    @Test
    public void checkAmountFood_v4() {
        Transaction transaction_1 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_2 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_3 = new Transaction("User", 1000, ExpenseCategory.FOOD);
        Transaction transaction_4 = new Transaction("User", 1000, ExpenseCategory.OTHERS);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3, transaction_4};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = foodExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 3000);
    }

}