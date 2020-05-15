package student_aleksey_kodin.lesson3.dayx.supertask1;

class User {
    private static final int ATTEMPT_VALUE = 3;
    private static final int ATTEMPT_BLOCK_VALUE = 0;
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
        attemptCount = ATTEMPT_VALUE;
    }
    void UserBlocked() {
        isUserBlock = true;
        attemptCount = ATTEMPT_BLOCK_VALUE;
        System.out.println(loginName + " blocked. You entered wrong password 3 times.");
    }
}
