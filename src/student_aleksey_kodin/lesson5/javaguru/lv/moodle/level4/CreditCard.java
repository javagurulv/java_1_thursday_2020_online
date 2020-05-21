package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level4;

class CreditCard {
    private static final int CARD_MIN_VALUE = 0;
    private final String cardNumber;
    private final String cardPin;
    private int cardBalance;
    private int cardCreditLimit;
    private int cardLoanDebt;

    public CreditCard(String cardNumber,String cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        cardBalance = CARD_MIN_VALUE;
        cardLoanDebt = CARD_MIN_VALUE;
        cardCreditLimit = CARD_MIN_VALUE;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardPin() {
        return cardPin;
    }
    public int getCardBalance() {
        return cardBalance;
    }
    public int getCardCreditLimit() {
        return cardCreditLimit;
    }
    public void setCardCreditLimit(int cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }
    public int getCardLoanDebt() {
        return cardLoanDebt;
    }
    public boolean deposit(int depositSum, String pinCode) {
        if (isPinCorrect(pinCode)) {
            if (cardLoanDebt == 0) {
                cardBalance += depositSum;
            } else  {
                int balanceForDeposit = depositSum - cardLoanDebt;
                cardBalance += balanceForDeposit;
                cardLoanDebt -= (depositSum - balanceForDeposit);
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean withdraw(int withdrawSum,String pinCode) {
        if (isPinCorrect(pinCode)) {
            if (cardBalance >= withdrawSum) {
                cardBalance -= withdrawSum;
            } else if(isAmountMoreWithdrawSum(withdrawSum)) {
                int balanceForCredit = withdrawSum - cardBalance;
                cardLoanDebt += balanceForCredit;
                cardBalance -= (withdrawSum - balanceForCredit);
            } else {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
    private boolean isPinCorrect(String pinCode) {
        return cardPin.equals(pinCode);
    }
    private boolean isAmountMoreWithdrawSum(int sum) {
        return cardBalance + cardCreditLimit - cardLoanDebt >= sum;
    }
}
