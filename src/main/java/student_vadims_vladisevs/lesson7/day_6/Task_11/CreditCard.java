package student_vadims_vladisevs.lesson7.day_6.Task_11;

import java.math.BigDecimal;

class CreditCard {


//    private int creditCardSerialNumber;  // зачем это свойство?
    private int creditCardPinCode;
    private BigDecimal creditCardDepositBalance;
    private BigDecimal creditLimit;
    private BigDecimal creditDebt;


    public CreditCard(int creditCardSerialNumber, int creditCardPinCode){
//        this.creditCardSerialNumber = creditCardSerialNumber;
        this.creditCardPinCode = creditCardPinCode;
        creditCardDepositBalance = BigDecimal.ZERO;
        creditDebt = BigDecimal.ZERO;
    }


    public void withdraw(int creditCardPinCode, BigDecimal amount){
        if (isCorrectPinCode(creditCardPinCode)){
            if (checkBalance(amount)){
                creditCardDepositBalance = creditCardDepositBalance.subtract(amount);
            } else if (checkLimit(amount)){
                creditCardDepositBalance = creditCardDepositBalance.subtract(amount);
                creditDebt = creditDebt.add(creditCardDepositBalance.negate());
                creditCardDepositBalance = BigDecimal.ZERO;
            } else {
                System.out.println("Denied! Over Limit!");
            }


        } else {
            System.out.println("Denied! Incorrect PIN Code!");
        }
    }


    public void deposit(int creditCardPinCode, BigDecimal amount){
        if (isCorrectPinCode(creditCardPinCode)){
            if (checkDebt(amount)){
                creditDebt = creditDebt.subtract(amount);
            } else {
                creditDebt = creditDebt.subtract(amount);
                creditCardDepositBalance = creditCardDepositBalance.add(creditDebt.negate());
                creditDebt = BigDecimal.ZERO;
            }
        } else {
            System.out.println("Denied! Incorrect PIN Code!");
        }
    }


    public boolean checkDebt(BigDecimal amount){
         return creditDebt.subtract(amount).compareTo(BigDecimal.ZERO) >= 0;
    }

    public boolean checkLimit(BigDecimal amount){
        BigDecimal tempValueBalance = creditCardDepositBalance.subtract(amount);
        BigDecimal tempValueDebt = creditDebt.add(tempValueBalance.negate());
        return tempValueDebt.compareTo(creditLimit) <= 0;
    }

    public boolean checkBalance(BigDecimal amount){
        return (creditCardDepositBalance.subtract(amount).compareTo(BigDecimal.ZERO)) >= 0;
    }

    public boolean isCorrectPinCode(int creditCardPinCode){
        return creditCardPinCode == getCreditCardPinCode();
    }

    public int getCreditCardPinCode() {
        return creditCardPinCode;
    }

    public BigDecimal getCreditCardDepositBalance() {
        return creditCardDepositBalance;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(BigDecimal creditDebt) {
        this.creditDebt = creditDebt;
    }

    public void setCreditCardDepositBalance(BigDecimal creditCardDepositBalance) {
        this.creditCardDepositBalance = creditCardDepositBalance;
    }

    public void printInfo(){
        System.out.println("Card BALANCE = " + getCreditCardDepositBalance());
        System.out.println("Card LIMIT = " + getCreditLimit());
        System.out.println("Card DEBT = " + getCreditDebt().toString());
    }
}
