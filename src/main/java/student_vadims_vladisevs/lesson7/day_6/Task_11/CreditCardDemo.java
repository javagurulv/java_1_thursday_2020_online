package student_vadims_vladisevs.lesson7.day_6.Task_11;

import java.math.BigDecimal;

class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard testCard = new CreditCard(123, 1234);
        testCard.setCreditLimit(new BigDecimal("1000"));
        testCard.printInfo();
        testCard.withdraw(1234, new BigDecimal("100"));
        System.out.println("------------");
        testCard.printInfo();
        System.out.println("------------");
        testCard.deposit(1234, new BigDecimal("200"));
        testCard.printInfo();
        System.out.println("------------");
        testCard.deposit(1234,new BigDecimal("200"));
        testCard.printInfo();
        System.out.println("------------");
        testCard.withdraw(1234,new BigDecimal("700"));
        testCard.printInfo();
        System.out.println("------------");
        testCard.deposit(1234,new BigDecimal("600"));
        testCard.printInfo();
        System.out.println("------------");
        testCard.withdraw(1234, new BigDecimal("1500.00"));
        System.out.println("------------");
        testCard.printInfo();
    }
}
