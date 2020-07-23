package student_aleksey_kodin.lesson12.level2.task_14;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {
    private final List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!(credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS))) {
            throw new AccessDeniedException();
        }
        return clients.stream().filter(cl -> cl.getUid().equals(uid)).findFirst();
    }
}
