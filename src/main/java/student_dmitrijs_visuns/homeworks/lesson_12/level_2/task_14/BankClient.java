package student_dmitrijs_visuns.homeworks.lesson_12.level_2.task_14;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient (String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}