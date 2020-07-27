package student_dmitrijs_visuns.homeworks.lesson_12.level_2.task_15;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean containRoleCAN_SEARCH_CLIENTS () {
        return roles.contains(Role.CAN_SEARCH_CLIENTS);
    }
}