package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_1.task_4;

class Safe {

    public int pinCode;
    public double moneyAmount;

    void deposit(double sum) {
        this.moneyAmount += sum;
    }

    void withdraw(double sum) {
        this.moneyAmount -= sum;
    }

}
