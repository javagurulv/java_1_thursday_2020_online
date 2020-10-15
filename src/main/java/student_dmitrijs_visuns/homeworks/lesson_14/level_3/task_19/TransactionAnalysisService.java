package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_19;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> transactionsBy2011 (List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

}
