package student_vadims_vladisevs.lesson_12.level_2;



import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles){
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean containCanSearchRole(){
        return getRoles().contains(Role.CAN_SEARCH_CLIENTS);
    }

}