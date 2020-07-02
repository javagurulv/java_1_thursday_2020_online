package student_vadims_vladisevs.lesson9.day_1.task_5;

import java.math.BigDecimal;
import java.sql.SQLOutput;

class Safe {

    private int pinCode;
    private BigDecimal moneyAmount;

    public Safe(int pinCode, BigDecimal moneyAmount){
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    private int getPinCode() {
        return pinCode;
    }

    private boolean checkPinCode(int pinCode){
        return pinCode == getPinCode();
    }

    public void putMoney(int pinCode, BigDecimal amount){
        if (checkPinCode(pinCode)){
            moneyAmount = moneyAmount.add(amount);
        } else {
            System.out.println("Incorrect pin code!");
        }
    }

    public void getMoney(int pinCode, BigDecimal amount){
        if (checkPinCode(pinCode)){
            moneyAmount = moneyAmount.subtract(amount);
        } else {
            System.out.println("Incorrect pin code!");
        }
    }
}
