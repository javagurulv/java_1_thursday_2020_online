package student_oleg_ivanov.lesson7.Day6.Task11;

import java.math.BigDecimal;

class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234);
        creditCard.setCreditCardLimit(new BigDecimal("500"));
        creditCard.deposit(1234, new BigDecimal("100"));
        System.out.println("--------------------");
        creditCard.deposit(1234, new BigDecimal("100"));
        System.out.println("--------------------");
        creditCard.withdraw(1234, new BigDecimal("110"));
        System.out.println("--------------------");
        creditCard.withdraw(1234, new BigDecimal("490"));
        System.out.println("--------------------");
        creditCard.withdraw(1234, new BigDecimal("650"));
        System.out.println("Credit card balance " + creditCard.getCreditCardBalance());
        System.out.println("Your debt " + creditCard.getCreditCardDebt());
    }
}
