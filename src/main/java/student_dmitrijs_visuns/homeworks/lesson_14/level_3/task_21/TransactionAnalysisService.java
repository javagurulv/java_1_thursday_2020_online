package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_21;

import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

}
