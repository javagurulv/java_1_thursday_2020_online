package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_11;

import java.math.BigDecimal;

class CreditCard {

    private String number;
    private int pinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal debt;

    public CreditCard(String number, int pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        this.balance = new BigDecimal("00.00");
        this.creditLimit = new BigDecimal("00.00");
        this.debt = new BigDecimal("00.00");
    }

    public void deposit(int pinCode, BigDecimal amount) {
        if (pinCode == this.pinCode) {
            int temp = debt.compareTo(BigDecimal.ZERO);
            if (temp == 0) {
                this.balance = this.balance.add(amount);
            } else {
                decreaseDebt(amount);
            }
        }
    }

    public void withdraw(int pinCode, BigDecimal amount) {
        int temp = this.debt.compareTo(creditLimit);
        if ((pinCode == this.pinCode) && (temp <= 0)) {
            int res = balance.compareTo(amount);
            if (res >= 0) {
                this.balance = this.balance.subtract(amount);
            } else {
                withdrawFromDebt(amount);
            }
        }
    }

    public void decreaseDebt(BigDecimal amount) {
        int res = amount.compareTo(this.debt);
        if (res < 0) {
            this.debt = this.debt.subtract(amount);
        } else if (res == 0) {
            this.debt = BigDecimal.ZERO;
        } else {
            BigDecimal residue = amount.subtract(this.debt);
            this.debt = BigDecimal.ZERO;
            this.balance = this.balance.add(residue);
        }
    }

    public void withdrawFromDebt(BigDecimal amount) {
        BigDecimal residue = amount.subtract(this.balance);
        this.balance = BigDecimal.ZERO;
        this.debt = this.debt.add(residue);
    }

    public void printInfoAbout() {
        System.out.println("Card number is " + this.number);
        System.out.println("Card PIN is " + this.pinCode);
        System.out.println("Card balance is " + this.balance);
        System.out.println("Card credit limit is " + this.creditLimit);
        System.out.println("Card debt is " + this.debt);
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getNumber() {
        return number;
    }

    public int getPinCode() {
        return pinCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
