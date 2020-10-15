package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_26;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

class TransactionAnalysisService {

    public Set<Integer> findAllTransactionsUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(toSet());
    }

    public List<Integer> findAllTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYearAndSortByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }


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
