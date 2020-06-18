package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_11;

class CreditCard {

    int creditCardNumber;
    int creditCardPinCode;
    int creditCardBalance;
    int creditCardLimit;
    int creditCardDebt;

    public void createCreditCard (int creditCardNumber, int creditCardPinCode) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardPinCode = creditCardPinCode;
        creditCardBalance = 0;
        creditCardDebt = 0;
        creditCardLimit = 0;
    }

    public void withdraw (int creditCardPinCode, int withdrawAmount) {
        if (creditCardPinCode == this.creditCardPinCode) {
            if (creditCardBalance >= withdrawAmount) {
                creditCardBalance -= withdrawAmount;
            } else if ((creditCardBalance < withdrawAmount)&&(creditCardDebt < creditCardLimit)) {
                creditCardBalance = creditCardBalance + creditCardDebt - withdrawAmount;
            }
        }
    }

    public void deposit (int creditCardPinCode, int depositAmount) {
        if (creditCardPinCode == this.creditCardPinCode) {
            if (creditCardDebt <= 0) {
                creditCardBalance = (creditCardDebt + depositAmount) + creditCardBalance;
            } else if (creditCardBalance > 0) {
                creditCardBalance += depositAmount;
            }
        }
    }

    public  int getCreditCardBalance () {
        return creditCardBalance;
    }

    public void changeCreditCardLimit(int creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }
}
