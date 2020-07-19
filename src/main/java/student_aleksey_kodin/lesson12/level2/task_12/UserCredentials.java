package student_aleksey_kodin.lesson12.level2.task_12;

import javax.management.relation.Role;
import java.util.List;

class UserCredentials {
    private final List<Role> roles;

    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
