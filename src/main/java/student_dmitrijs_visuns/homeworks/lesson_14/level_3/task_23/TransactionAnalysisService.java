package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_23;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Transaction> reverseSortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(toList());
    }


    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

}
