package student_dmitrijs_visuns.homeworks.lesson_12.level_2.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    @Test
    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);
        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

    @Test
    public void shouldReturnOptionalEmpty() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);
        List<Role> roles = new ArrayList();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);
        assertEquals(api.findByUid(credentials, "23"), Optional.empty());
    }

    @Test
    public void shouldReturnOptionalOfClient() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList();
        BankClient client1 = new BankClient("23", "Michael J");
        clients.add(client1);
        BankApi api = new BankApiImpl(clients);
        List<Role> roles = new ArrayList();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);
        assertEquals(api.findByUid(credentials, "23"), Optional.of(client1));
    }

}