package student_aleksey_kodin.lesson3.dayx.supertask1;

class UserLoginService {
    boolean login(User user, String password) {
        if(!user.isUserBlock()) {
            if (password.equals(user.getPassword())) {
                user.resetAttemptCount();
                return true;
            } else if (user.getAttemptCount() == 1) {
                user.UserBlocked();
                return false;
            } else {
                user.setAttemptCount((byte) (user.getAttemptCount() - 1));
                return false;
            }
        }
        return false;
    }
}
