package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_30;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> getAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> sortFromSmallestToLargestValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortFromLargestToSmallestValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> sortFromSmallestToLargestValueInYear2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> getAllYearsWhenTransactionsWerePassed(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    Set<Integer> getAllUniqueYearsWhenTransactionsWerePassed(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    Set<String> getAllUniqueTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTraderName)
                .collect(Collectors.toSet());
    }

    Set<String> getAllUniqueTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTraderCity)
                .collect(Collectors.toSet());
    }

    List<String> getAllTraderNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .filter(transaction -> transaction.getTraderCity().equals(city))
                .map(Transaction::getTraderName)
                .distinct()
                .collect(Collectors.toList());
    }
}
