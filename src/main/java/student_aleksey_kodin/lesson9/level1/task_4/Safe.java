package student_aleksey_kodin.lesson9.level1.task_4;

class Safe {

    public int pinNumber;
    public int sum;

    Safe(int pinNumber, int sum) {
        this.pinNumber = pinNumber;
        this.sum = sum;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getBalance(int pinNumber) {
        if (this.pinNumber == pinNumber) {
            return sum;
        }
        return -1;
    }

    public boolean changePin(int oldPin, int newPin) {
        if (oldPin == pinNumber) {
            pinNumber = newPin;
            return true;
        }
        return false;
    }
}
