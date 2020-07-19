package student_aleksey_kodin.lesson12.level2.task_14;

import java.util.ArrayList;
import java.util.List;

class UserCredentials {
    private final List<Role> roles;

    UserCredentials(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
