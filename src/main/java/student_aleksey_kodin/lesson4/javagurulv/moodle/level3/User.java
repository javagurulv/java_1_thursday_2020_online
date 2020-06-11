package student_aleksey_kodin.lesson4.javagurulv.moodle.level3;

class User {
    private final String loginName;
    private final String password;
    private boolean isUserBlock;
    private byte attemptCount;

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
        isUserBlock = false;
        attemptCount = 3;
    }

    public boolean isUserBlock() {
        return isUserBlock;
    }

    public String getPassword() {
        return password;
    }

    public byte getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(byte attemptCount) {
        this.attemptCount = attemptCount;
    }

    void resetAttemptCount() {
        isUserBlock = false;
        attemptCount = 3;
    }
    void UserBlocked() {
        isUserBlock = true;
        attemptCount = 0;
        System.out.println(loginName + " blocked. You entered wrong password 3 times.");
    }
}
