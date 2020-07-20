package student_aleksey_kodin.lesson12.level2.task_10;

import teacher.lesson_12.lessoncode.AccessDeniedException;

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
