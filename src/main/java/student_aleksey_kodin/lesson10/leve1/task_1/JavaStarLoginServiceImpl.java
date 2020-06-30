package student_aleksey_kodin.lesson10.leve1.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    @Override
    public boolean notNull(String text) {
        return text != null;
    }
}
