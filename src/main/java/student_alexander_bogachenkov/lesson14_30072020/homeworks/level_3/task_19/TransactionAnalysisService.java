package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_19;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> getAll2011YearTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

}
