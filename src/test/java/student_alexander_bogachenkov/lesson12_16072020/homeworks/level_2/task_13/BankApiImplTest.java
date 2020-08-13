package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_2.task_13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankApiImplTest {

    @Test(expected = AccessDeniedException.class)
    public void shouldThrowAccessDeniedException_whenCAN_SEARCH_CLIENTSNotExist() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client = new BankClient("1", "Alex Bogachenkov");
        clients.add(client);
        List<Role> roles = new ArrayList<>();
        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl bankApi = new BankApiImpl(clients);
        bankApi.findByUid(userCredentials, "1");
    }

    @Test()
    public void shouldReturnFilledOptional_whenUserFoundByUid() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client = new BankClient("1", "Alex Bogachenkov");
        clients.add(client);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl bankApi = new BankApiImpl(clients);
        Optional<BankClient> actual = bankApi.findByUid(userCredentials, "1");
        Optional<BankClient> expected = Optional.of(new BankClient("1", "Alex Bogachenkov"));
    }

    @Test()
    public void shouldReturnEmptyOptional_whenUserNotFoundByUid() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client = new BankClient("1", "Alex Bogachenkov");
        clients.add(client);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl bankApi = new BankApiImpl(clients);
        Optional<BankClient> actual = bankApi.findByUid(userCredentials, "2");
        Optional<BankClient> expected = Optional.empty();
    }

}