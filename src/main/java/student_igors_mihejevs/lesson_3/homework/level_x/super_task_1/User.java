package student_igors_mihejevs.lesson_3.homework.level_x.super_task_1;

class User {

    private String loginName, password;
    private boolean isBlocked = false;
    private byte numberOfAttempts = 3;

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public void cancelNumberOfAttempts() {
        numberOfAttempts = 3;
    }

    public void decreaseNumberOfAttempts() {
        numberOfAttempts--;
    }


    public void userIsBlocked() {
        if(numberOfAttempts == 0) {
            isBlocked = true;
        }
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public byte getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

}
