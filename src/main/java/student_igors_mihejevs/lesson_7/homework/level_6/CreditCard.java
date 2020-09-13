package student_igors_mihejevs.lesson_7.homework.level_6;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "А где тесты?")
@CodeReviewComment(student = "Тесты в JUnit")
class CreditCard {

    private String cardNumber;
    private int cardPinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal loanDebt;

    CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.balance = ZERO;
        this.loanDebt = ZERO;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLoanDebt() {
        return loanDebt;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setLoanDebt(BigDecimal loanDebt) {
        this.loanDebt = loanDebt;
    }

    void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    void deposit(int pinCode, BigDecimal amount) {
        if (isPinCodeCorrect(pinCode)) {
            if (isLoanDebtZero(this.loanDebt)) {
                this.balance = this.balance.add(amount);
            } else {
                this.loanDebt = this.loanDebt.add(amount);
                if (this.loanDebt.signum() == 1) {
                    this.balance = this.balance.add(this.loanDebt);
                    this.loanDebt = ZERO;
                }
            }
        } else notCorrectPinCode();
    }

    void withdraw(int pinCode, BigDecimal amount) {
        if (isPinCodeCorrect(pinCode)) {
            if (this.balance.compareTo(amount) > 0.0) {
                this.balance = this.balance.subtract(amount);
            } else {
                if (this.creditLimit.add(this.balance.subtract(amount)).signum() >= 0) {
                    this.creditLimit = this.creditLimit.add(this.balance.subtract(amount));
                    this.balance = ZERO;
                } else {
                    System.out.println("Sorry, you don't have enough money and credit allowed");
                }
            }
        } else notCorrectPinCode();
    }

    void notCorrectPinCode() {
        System.out.println("Please enter correct PIN code");
    }

    boolean isLoanDebtZero(BigDecimal loanDebt) {
        return (loanDebt.compareTo(BigDecimal.ZERO) == 0);
    }

    boolean isPinCodeCorrect(int pinCode) {
        return pinCode == this.cardPinCode;
    }

}
