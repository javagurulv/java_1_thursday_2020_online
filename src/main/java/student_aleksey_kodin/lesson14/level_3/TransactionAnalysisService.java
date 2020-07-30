package student_aleksey_kodin.lesson14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream().filter(tr -> tr.getYear() == year).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueUp(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueDown(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsBy2011AndSort(List<Transaction> allTransactions) {
        return allTransactions.stream().filter(tr -> tr.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
