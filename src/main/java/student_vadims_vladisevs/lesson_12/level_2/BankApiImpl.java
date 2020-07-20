package student_vadims_vladisevs.lesson_12.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

private List<BankClient> clients;

public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
        }

public Optional<BankClient> findByUid(UserCredentials credentials,
                                      String uid) throws AccessDeniedException {

        if(!credentials.containCanSearchRole()){
            throw new AccessDeniedException();
        }
        for (BankClient client : clients){
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();

    }



}
