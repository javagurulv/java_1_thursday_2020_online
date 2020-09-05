package teacher.lesson_3.homework.level_7_senior.solutions.super_task_1;

public class UserLoginService {

	public boolean login(User user, String password){
		if (user.isBlocked()) {
			return false;
		}
		if (user.isPasswordEquals(password)) {
			user.unblock();
			return true;
		} else {
			user.reduceLoginAttempts();
			return false;
		}
	}

}