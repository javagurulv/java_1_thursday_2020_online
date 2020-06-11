package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_11;

import java.math.BigDecimal;

class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1111222233334444", 1234);
        card1.printInfoAbout();
        card1.deposit(1234,new BigDecimal("12.00"));
        System.out.println();
        card1.printInfoAbout();
        System.out.println();
        card1.withdraw(1234,new BigDecimal("15.00"));
        card1.printInfoAbout();
        card1.setCreditLimit(new BigDecimal("10.00"));
        card1.withdraw(1234,new BigDecimal("18.00"));
        card1.printInfoAbout();
        card1.withdraw(1234,new BigDecimal("10.00"));
        card1.printInfoAbout();
        card1.deposit(1234,new BigDecimal("20.00"));
        card1.printInfoAbout();
        card1.deposit(1234,new BigDecimal("2.00"));
        card1.printInfoAbout();
    }

}
