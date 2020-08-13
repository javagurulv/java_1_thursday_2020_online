package student_vadims_vladisevs.lesson_12.level_2;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUid() {
        return uid;
    }

}