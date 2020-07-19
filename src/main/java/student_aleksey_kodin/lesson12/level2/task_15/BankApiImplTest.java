package student_aleksey_kodin.lesson12.level2.task_15;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldCredentialsNotHaveRole();
    }

    private void shouldCredentialsNotHaveRole() {
        List<BankClient> clients = new ArrayList<>();
        BankApiImpl api = new BankApiImpl(clients);

        final ArrayList<Role> roles = new ArrayList<>();
        final UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1");
            System.out.println("TEST FAIL");

        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
        }
    }
}
