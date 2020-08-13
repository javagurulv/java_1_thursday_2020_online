package student_dmitrijs_visuns.homeworks.lesson_10.level_1.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

@Override
public boolean canLogin(String login, String password) {
        return notNull(login)
        && login.equals("javastar")
        && notNull(password)
        && password.equals("pass");
        }

private boolean notNull(String text) {
        return text != null;
        }

}