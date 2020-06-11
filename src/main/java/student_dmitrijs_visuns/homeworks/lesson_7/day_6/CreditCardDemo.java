package student_dmitrijs_visuns.homeworks.lesson_7.day_6;

import java.math.BigDecimal;

class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard cc = new CreditCard(1234, 333);
        System.out.println(cc.getCardNumber());
        System.out.println(cc.getCardPinCode());
        System.out.println(cc.getCardBalance());
        cc.depositeToCard(111, BigDecimal.valueOf(50.00));

    }

}
