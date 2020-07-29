package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntertainmentExpensesCalculatorTest {
    EntertainmentExpensesCalculator entertainmentExpensesCalculator = new EntertainmentExpensesCalculator();

    @Test
    public void checkAmountFood_v1() {
        Transaction transaction_1 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction[] allTransactions = {transaction_1};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 50);
    }

    @Test
    public void checkAmountFood_v2() {
        Transaction transaction_1 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_2 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction[] allTransactions = {transaction_1, transaction_2};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 100);
    }

    @Test
    public void checkAmountFood_v3() {
        Transaction transaction_1 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_2 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_3 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 150);
    }

    @Test
    public void checkAmountFood_v4() {
        Transaction transaction_1 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_2 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_3 = new Transaction("User", 50, ExpenseCategory.ENTERTAINMENT);
        Transaction transaction_4 = new Transaction("User", 50, ExpenseCategory.FOOD);
        Transaction[] allTransactions = {transaction_1, transaction_2, transaction_3, transaction_4};
        BankAccount bankAccount = new BankAccount(allTransactions);

        int result = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);

        assertEquals(result, 150);
    }
}