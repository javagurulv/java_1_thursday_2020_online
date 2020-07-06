package student_julija_skopeca.practical_tasks.lesson_9.level_1.task_5;

class Safe {

    public int pinCode;
    public int safeBalance;

    Safe(int pinCode, int safeBalance){
        this.pinCode = pinCode;
        this.safeBalance = safeBalance;
    }

    public int getPinCode() {
        return pinCode;}

    public void getSafeBalance() {System.out.println(safeBalance);}

    private boolean isPinCorrect(int pinCode) {
        return pinCode == getPinCode();
    }

    public void putMoney(int pinCode, int inputAmout){
        if(isPinCorrect(pinCode)){
            safeBalance+=inputAmout;
        } else {
            System.out.println("Incorrect PIN code");
        }
    }

    public void getMoney(int pinCode, int outputAmout){
        if(isPinCorrect(pinCode)){
            safeBalance+=outputAmout;
        } else {
            System.out.println("Incorrect PIN code");
        }
    }


}
