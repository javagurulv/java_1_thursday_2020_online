package student_aleksey_kodin.lesson12.level2.task_12;

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
