package student_aleksey_kodin.lesson12.level2.task_16;

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

    public boolean isHaveRoleSearchClients () {
        return roles.contains(Role.CAN_SEARCH_CLIENTS);
    }
}
