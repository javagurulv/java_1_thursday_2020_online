package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_2.task_12;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}