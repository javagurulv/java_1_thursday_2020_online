package student_vadims_vladisevs.lesson_x.bank_account;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntertainmentExpensesCalculatorTest {

    EntertainmentExpensesCalculator entertainmentExpensesCalculator = new EntertainmentExpensesCalculator();
    Transaction deposit = TransactionFactory.createDepositTransaction(1000);
    Transaction withdrawal_ENTERTAINMENT_1 = TransactionFactory.createWithdrawalTransaction(10, ExpenseCategory.ENTERTAINMENT);
    Transaction withdrawal_ENTERTAINMENT_2 = TransactionFactory.createWithdrawalTransaction(20, ExpenseCategory.ENTERTAINMENT);
    Transaction withdrawal_OTHERS = TransactionFactory.createWithdrawalTransaction(400, ExpenseCategory.OTHERS);


    @Test
    public void calculateExpensesAmount_v1() {
        Transaction[] allTransactions = {deposit, withdrawal_ENTERTAINMENT_1, withdrawal_ENTERTAINMENT_2, withdrawal_OTHERS};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions, 500);
        int actual = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(30, actual);
    }

    @Test
    public void calculateExpensesAmount_v2() {
        Transaction[] allTransactions = {deposit, withdrawal_ENTERTAINMENT_1, withdrawal_OTHERS};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions, 500);
        int actual = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(10, actual);
    }

    @Test
    public void calculateExpensesAmount_v3() {
        Transaction[] allTransactions = {deposit, withdrawal_ENTERTAINMENT_2};
        BankAccount bankAccount = new BankAccount("Vadim", allTransactions, 500);
        int actual = entertainmentExpensesCalculator.calculateExpensesAmount(bankAccount);
        assertEquals(20, actual);
    }
}