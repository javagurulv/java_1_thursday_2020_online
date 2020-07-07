package student_julija_skopeca.practical_tasks.lesson_9.level_1.task_4;

class Safe {

    public int pinCode;
    public int safeBalance;

    Safe(int pinCode, int safeBalance){
        this.pinCode = pinCode;
        this.safeBalance = safeBalance;
    }

    public void getPinCode() {
        System.out.println(pinCode);}
    public void getSafeBalance() {System.out.println(safeBalance);}
}
