package student_diana_miranovica.lesson_7.homework.day_6.task_11;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.correctCreditCardPinTest();
        creditCardTest.depositingMoneyWithDebtWithoutBalanceTest();
        creditCardTest.depositingMoneyWithoutDebtWithBalanceTest();
        creditCardTest.withdrawalMoneyWithBalanceOnDebtTest();
        creditCardTest.withdrawalMoneyWithBalanceOnNoDebtTest();
        creditCardTest.withdrawalMoneyWithoutBalanceOnNoDebtTest();
        creditCardTest.withdrawalMoneyWithoutBalanceOnDebtTest();

    }


    public void correctCreditCardPinTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("1234 4501 1121 8754",1990);
        int result = creditCard.getCreditCardPin();
        if (result == 1990){
            System.out.println("correct CreditCard Pin - OK");
        }else {
            System.out.println("correct CreditCard Pin - Fail");
        }
    }

    public void depositingMoneyWithDebtWithoutBalanceTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9882 1682 9987 2634", 1980);
        creditCard.deposit(1980, 35);
        creditCard.withdraw(1980, 30);
        int result = creditCard.getCreditCardBalance();
        if (result == 5 ){
            System.out.println("depositing Money With Debt Without Balance Test - OK");
        }else {
            System.out.println("depositing Money With Debt Without Balance Test - Fail");
        }
    }

    public void depositingMoneyWithoutDebtWithBalanceTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9855 4839 3209 3829",1890);
        creditCard.deposit(1890, 20);
        creditCard.deposit(1890,55);
        int result = creditCard.getCreditCardBalance();
        if (result == 75){
            System.out.println("depositing Money Without Debt With Balance Test  - Ok");
        }else {
            System.out.println("depositing Money Without Debt With Balance Test - Fail");
        }
    }

    public void withdrawalMoneyWithBalanceOnDebtTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9844 4372 7734 4329",2003);
        creditCard.deposit(2003, 200);
        creditCard.withdraw(2003, 350);
        int result = creditCard.getCreditCardBalance();
        if (result == -150){
            System.out.println("withdrawal Money With Balance On Debt Test - OK");
        }else {
            System.out.println("withdrawal Money With Balance On Debt Test - Fail");
        }
    }

    public void withdrawalMoneyWithBalanceOnNoDebtTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9844 4372 7734 4329",2003);
        creditCard.deposit(2003, 200);
        creditCard.withdraw(2003, 200);
        int result = creditCard.getCreditCardBalance();
        if (result == 0){
            System.out.println("withdrawal Money With Balance On No Debt Test - OK");
        }else {
            System.out.println("withdrawal Money With Balance On No Debt Test - Fail");
        }
    }
    public void withdrawalMoneyWithoutBalanceOnNoDebtTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9844 4372 7734 4329",2003);
        creditCard.deposit(2003, 0);
        creditCard.withdraw(2003, 200);
        int result = creditCard.getCreditCardBalance();
        if (result == -200){
            System.out.println("withdrawal Money Without Balance On No Debt Test - OK");
        }else {
            System.out.println("withdrawal Money Without Balance On No Debt Test - Fail");
        }
    }
    public void withdrawalMoneyWithoutBalanceOnDebtTest(){
        CreditCard creditCard = new CreditCard();
        creditCard.creditCardCreate("9844 4372 7734 4329",2003);
        creditCard.deposit(2003, 0);
        creditCard.withdraw(2003, 200);
        creditCard.withdraw(2003,150);
        int result = creditCard.getCreditCardBalance();
        if (result == -350){
            System.out.println("withdrawal Money Without Balance On No Debt Test - Ok");
        }else {
            System.out.println("withdrawal Money Without Balance On No Debt Test - Fail" );
        }
    }
}
