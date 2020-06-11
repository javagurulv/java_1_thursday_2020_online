package student_diana_miranovica.lesson3.homeworks.day_x;

class UserLoginService {
    public boolean login(User user, String password) {
        if (!user.isUserBlocked()) {
            if (password.equals(user.getPassword(password))) {
                user.setCountOfAttempts(3);
                return true;
            } else if (user.getCountOfAttempts(1) == 1) {
                user.blockUser();
                return false;
            } else {
                user.setCountOfAttempts(1);
                return false;
            }
        } else {
            return false;
        }
    }
}
