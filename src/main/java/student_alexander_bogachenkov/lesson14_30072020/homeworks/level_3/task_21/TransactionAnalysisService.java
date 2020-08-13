package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_21;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> getAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

}
