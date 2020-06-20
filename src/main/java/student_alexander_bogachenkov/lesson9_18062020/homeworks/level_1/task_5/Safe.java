package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_1.task_5;

class Safe {

    private int pinCode;
    private double moneyAmount;

    public Safe(int pinCode, double moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    void getMoney(int pinCode, double sum) {
        if (pinCode == this.pinCode) {
            moneyAmount -= sum;
        }
    }

    void putMoney(int pinCode, double sum) {
        if (pinCode == this.pinCode) {
            moneyAmount += sum;
        }
    }

    @Override
    public String toString() {
        return "Safe = {pinCode = " + pinCode + "; moneyAmount = " + moneyAmount + "}";
    }
}
