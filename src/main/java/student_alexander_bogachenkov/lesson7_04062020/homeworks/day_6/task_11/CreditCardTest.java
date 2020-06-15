package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_11;

import java.math.BigDecimal;

/*
Слишком мало тестов!
Нужно придумать больше тестов, так как кейсов намного больше.

Deposit() - что если у нас есть долг, а что если у нас нет долга ....
Withdraw() - что если у нас есть долг, а что если у нас нет долга ....
*/

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.shouldCreateCard();
        test.shouldDeposit();
        test.shouldWithdraw();
    }

    public void shouldCreateCard() {
        CreditCard creditCard = new CreditCard("1111222233334444", 1234);

        String expectedNumber = "1111222233334444";
        int expectedPinCode = 1234;
        String actualNumber = creditCard.getNumber();
        int actualPinCode = creditCard.getPinCode();
        if ((expectedNumber.equals(actualNumber)) && (expectedPinCode == actualPinCode)) {
            System.out.println("shouldCreateCard PASSED");
        } else {
            System.out.println("shouldCreateCard FAILED");
        }
    }

    public void shouldDeposit() {
        CreditCard creditCard = new CreditCard("1111222233334444", 1234);
        creditCard.deposit(1234, new BigDecimal("66.00"));

        BigDecimal expectedBalance = new BigDecimal("66.00");
        BigDecimal actualBalance = creditCard.getBalance();
        int res = expectedBalance.compareTo(actualBalance);
        if (res == 0) {
            System.out.println("shouldDeposit PASSED");
        } else {
            System.out.println("shouldDeposit FAILED");
        }
    }

    public void shouldWithdraw() {
        CreditCard creditCard = new CreditCard("1111222233334444", 1234);
        creditCard.deposit(1234, new BigDecimal("66.00"));
        creditCard.withdraw(1234, new BigDecimal("30.00"));

        BigDecimal expectedBalance = new BigDecimal("36.00");
        BigDecimal actualBalance = creditCard.getBalance();
        int res = expectedBalance.compareTo(actualBalance);
        if (res == 0) {
            System.out.println("shouldWithdraw PASSED");
        } else {
            System.out.println("shouldWithdraw FAILED");
        }
    }
}
