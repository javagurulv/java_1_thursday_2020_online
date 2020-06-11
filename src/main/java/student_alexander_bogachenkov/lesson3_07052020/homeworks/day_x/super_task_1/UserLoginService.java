package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_x.super_task_1;

class UserLoginService {

    public boolean login(User user, String password) {
        if (!user.IsBlocked()) {
            if (password.equals(user.getPassword())) {
                user.resetAmountOfLoginAttempts();
                return true;
            } else if (user.getAmountOfLoginAttempts() == 1) {
                user.blockUser();
                return false;
            } else {
                user.setAmountOfLoginAttempts(1);
                return false;
            }
        } else {
            return false;
        }
    }
}
