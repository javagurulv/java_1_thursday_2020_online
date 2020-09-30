package student_dmitrijs_visuns.homeworks.lesson_14.level_6.task_38;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

class TransactionAnalysisService {

    String getAllTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getCity())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }

    String getAllTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }

    OptionalInt findMinTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(transaction -> transaction.getValue()).min();
    }

    OptionalInt findMaxTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(transaction -> transaction.getValue()).max();
    }

    public boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(cityToFind))
                .map(trader -> trader.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public Set<String> findAllCambridgeTradersByTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(trader -> trader.getName())
                .collect(toSet());
    }

    public Set<String> findAllTransactionTradersUniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());
    }

    public Set<String> findAllTransactionTradersUniqueNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(toSet());
    }

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
