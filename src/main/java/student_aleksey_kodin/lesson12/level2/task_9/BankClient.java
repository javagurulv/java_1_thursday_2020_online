package student_aleksey_kodin.lesson12.level2.task_9;

class BankClient {
    private final String uid;
    private final String fullName;

    public BankClient(String uid, String fullName) {
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
