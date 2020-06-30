package student_diana_miranovica.lesson_7.homework.day_6.task_11;

import java.math.BigDecimal;

class CreditCard {

  String creditCardNumber;
  private int creditCardPin;
  private int creditCardBalance;
  private int creditCardLimit;
  private int creditCardLoanDebt;


  public void creditCardCreate(String creditCardNumber, int creditCardPin){
   this.creditCardNumber = creditCardNumber;
   this.creditCardPin = creditCardPin;
   creditCardBalance = 0;
   creditCardLimit = 300;
   creditCardLoanDebt = 0;
  }

  public void deposit (int creditCardPin, int depositAmount){
   if(creditCardPin == this.creditCardPin ){
    if(creditCardLoanDebt <= 0){
     creditCardBalance = (creditCardBalance + depositAmount + creditCardLoanDebt);
    }else if(creditCardBalance > 0){
     creditCardBalance += depositAmount;
    }
   }
  }
  public void withdraw(int creditCardPin, int withdrawAmount){
   if(creditCardPin == this.creditCardPin){
    if (creditCardBalance >= withdrawAmount){
     creditCardBalance -= withdrawAmount;
    }else if((creditCardBalance < withdrawAmount)&&
            (creditCardLoanDebt < creditCardLimit)){
     creditCardBalance = creditCardBalance + creditCardLoanDebt - withdrawAmount;
    }
   }
  }


  public int getCreditCardBalance() {
   return creditCardBalance;
  }

    public int getCreditCardPin() {
        return creditCardPin;
    }

    public void setCreditCardPin(int creditCardPin) {
        this.creditCardPin = creditCardPin;
    }

    public void setCreditCardLimit(int creditCardLimit){
   this.creditCardLimit = creditCardLimit;
  }
 }
