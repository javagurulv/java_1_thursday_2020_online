package student_aleksey_kodin.lesson9.level1.task_5;

class Safe {

    private int pinNumber;
    private int sum;

    Safe(int pinNumber, int sum) {
        this.pinNumber = pinNumber;
        this.sum = sum;
    }

    public int getPin() {
        return pinNumber;
    }

    public int getBalance(int pin) {
        if (isPinIncorrect(pin)) {
            return -1;
        }
        return sum;
    }

    public boolean getMoney(int pin, int takeSum) {
        if (isPinIncorrect(pin)) {
            return false;
        }
        sum -= takeSum;
        return true;
    }

    public boolean putMoney(int pin, int sumDeposit) {
        if (isPinIncorrect(pin)) {
            return false;
        }
        if (sumDeposit > 0) {
            sum += sumDeposit;
        }
        return true;
    }

    public boolean changePin(int oldPin, int newPin) {
        if (oldPin == pinNumber) {
            pinNumber = newPin;
            return true;
        }
        return false;
    }

    private boolean isPinIncorrect(int pin) {
        return getPin() != pin;
    }
}
