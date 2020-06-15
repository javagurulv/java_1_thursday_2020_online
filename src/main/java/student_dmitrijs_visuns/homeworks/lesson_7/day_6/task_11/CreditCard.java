package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_11;

import java.math.BigDecimal;

class CreditCard {

    private int cardNumber;
    private int cardPinCode;
    private BigDecimal cardBalance;
    private BigDecimal cardCreditLimit;
    private BigDecimal cardCreditDebt;


    public CreditCard (int cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.cardBalance = new BigDecimal("00.00");
        this.cardCreditDebt = new BigDecimal("00.00");
        this.cardCreditLimit = cardCreditLimit;
    }

    public void depositeToCard (int pinCode, BigDecimal moneyToDeposite) {
        if (pinCode != this.cardPinCode) {
            System.out.println("Incorrect PIN, transaction declined");
            return;
        }

        int temp = cardCreditDebt.compareTo(BigDecimal.ZERO);
        if (temp == 0) {
            this.cardBalance = this.cardBalance.add(moneyToDeposite);
            System.out.println(this.cardBalance);
        } else {
            decreaseDebt(moneyToDeposite);
        }
    }


    public void decreaseDebt(BigDecimal moneyToDeposite) {
        int res = moneyToDeposite.compareTo(this.cardCreditDebt);
        if (res < 0) {
            this.cardCreditDebt = this.cardCreditDebt.subtract(moneyToDeposite);
        } else if (res == 0) {
            this.cardCreditDebt = BigDecimal.ZERO;
        } else {
            BigDecimal residue = moneyToDeposite.subtract(this.cardCreditDebt);
            this.cardCreditDebt = BigDecimal.ZERO;
            this.cardBalance = this.cardBalance.add(residue);
        }
    }

    public void checkIfEnteredPinIsCorrect (int pinCode) {
        if (pinCode != this.cardPinCode) {
            System.out.println("Incorrect PIN, transaction declined");
            return;
        }
    }

    public int getCardNumber () {
       return cardNumber;
    }

    public int getCardPinCode() {
        return cardPinCode;
    }

    public BigDecimal getCardBalance() {
        return cardBalance;
    }




}
