package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_2.task_16;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!(credentials.hasRole(Role.CAN_SEARCH_CLIENTS))) {
            throw new AccessDeniedException();
        } else {
            for (BankClient client : clients) {
                if (client.getUid().equals(uid)) {
                    return Optional.of(client);
                }
            }
            return Optional.empty();
        }
    }
}