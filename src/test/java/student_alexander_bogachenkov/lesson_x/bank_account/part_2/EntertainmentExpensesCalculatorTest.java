package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntertainmentExpensesCalculatorTest {

    @Test
    public void shouldCalculateExpensesAmount() {
        Transaction deposit800 = TransactionFactory.createDepositTransaction(150);
        Transaction withdrawal500 = TransactionFactory.createWithdrawalTransaction(500, ExpenseCategory.ENTERTAINMENT);
        Transaction withdrawal100 = TransactionFactory.createWithdrawalTransaction(100, ExpenseCategory.GAMBLING);
        Transaction withdrawal50 = TransactionFactory.createWithdrawalTransaction(50, ExpenseCategory.ENTERTAINMENT);
        Transaction[] transactions = {deposit800, withdrawal500, withdrawal100, withdrawal50};
        BankAccount bankAccount = new BankAccount("John", transactions, 0);
        EntertainmentExpensesCalculator calculator = new EntertainmentExpensesCalculator();
        int actual = calculator.calculateExpensesAmount(bankAccount);
        assertEquals(550, actual);
    }

}