package student_aleksey_kodin.lesson14.level_6;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream().filter(tr -> tr.getYear() == year).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueUp(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueDown(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsBy2011AndSort(List<Transaction> allTransactions) {
        return allTransactions.stream().filter(tr -> tr.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findAllYears(List<Transaction> allTransactions) {
        return allTransactions.stream().map(Transaction::getYear).collect(Collectors.toList());
    }

    public Set<Integer> findAllYearsNoDuplicates(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllTradersNoDuplicates(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllTradersCitiesNoDuplicates(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<Trader> findAllTradersFromCambridge(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(tr -> tr.getCity().equals("Cambridge"))
                .collect(Collectors.toSet());
    }

    public Set<Trader> findTradersCities(List<Transaction> allTransactions, String traderCity) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(tr -> tr.getCity().equals(traderCity))
                .collect(Collectors.toSet());
    }

    public boolean isTraderFromCity(List<Transaction> allTransactions, String traderCity) {
        return allTransactions.stream()
                .anyMatch(tr -> tr.getTrader().getCity().equals(traderCity));
    }

    public OptionalInt findMaxValue(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .mapToInt(Transaction::getValue).max();
    }

    public OptionalInt findMinValue(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .mapToInt(Transaction::getValue).min();
    }

    public String TradersNames(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String TradersCities(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(","));
    }
}
