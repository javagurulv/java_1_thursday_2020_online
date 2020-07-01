package student_oleg_ivanov.lesson7.Day6.Task11;

import java.math.BigDecimal;

class CreditCard {
     private int creditCardPinCode;
     private BigDecimal creditCardBalance;
     private BigDecimal creditCardLimit;
     private BigDecimal creditCardDebt;

     public CreditCard(int creditCardPinCode) {
          this.creditCardPinCode = creditCardPinCode;
          creditCardBalance = BigDecimal.ZERO;
          creditCardDebt = BigDecimal.ZERO;
     }

     public void deposit(int creditCardPinCode, BigDecimal amount) {
          if (creditCardPinCode == getCreditCardPinCode()) {
               if (getCreditCardDebt().subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
                    creditCardDebt = getCreditCardDebt().subtract(amount);
                    System.out.println("Add money to account " + amount);
               } else {
                    creditCardDebt = getCreditCardDebt().subtract(amount).negate();
                    creditCardBalance = getCreditCardBalance().add(getCreditCardDebt());
                    creditCardDebt = BigDecimal.ZERO;
                    System.out.println("Add money to account " + amount);
               }
          } else {
               System.out.println("Pin code is not correct ");

          }
     }

     public void withdraw(int creditCardPinCode, BigDecimal amount) {
          if (creditCardPinCode == getCreditCardPinCode()) {
               if (getCreditCardBalance().subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
                    creditCardBalance = getCreditCardBalance().subtract(amount);
                    System.out.println("Withdraw money from the account " +amount);

               } else if (checkLimit(amount)) {
                    creditCardBalance = getCreditCardBalance().subtract(amount).negate();
                    creditCardDebt = getCreditCardDebt().add(creditCardBalance);
                    creditCardBalance = BigDecimal.ZERO;
                    System.out.println("Withdraw money from the account " + amount);
               } else {
                    System.out.println("Denied, excess of limit!!! " + amount);
               }

          } else {
               System.out.println("Pin code is not correct ");
          }
     }

     public int getCreditCardPinCode() {
          return creditCardPinCode;
     }

     public BigDecimal getCreditCardDebt() {
          return creditCardDebt;
     }

     public BigDecimal getCreditCardBalance() {
          return creditCardBalance;
     }

     public void setCreditCardLimit(BigDecimal creditCardLimit) {
          this.creditCardLimit = creditCardLimit;
     }

     public boolean checkLimit(BigDecimal amount) {
          BigDecimal creditCardBalance1 = getCreditCardBalance().subtract(amount).negate();
          BigDecimal creditCardDebt1 = getCreditCardDebt().add(creditCardBalance1);
          return creditCardDebt1.compareTo(getCreditCardLimit()) <= 0;

     }

     public BigDecimal getCreditCardLimit() {
          return creditCardLimit;
     }
}


