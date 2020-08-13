package student_igors_mihejevs.lesson_3.homework.level_x.super_task_1;

class UserLoginService {

    public boolean login(User user, String password) {

        if(password.equals(user.getPassword())) {
            user.cancelNumberOfAttempts();
            return true;
        } else {
            user.decreaseNumberOfAttempts();
            user.userIsBlocked();
            return false;
        }
    }

}
