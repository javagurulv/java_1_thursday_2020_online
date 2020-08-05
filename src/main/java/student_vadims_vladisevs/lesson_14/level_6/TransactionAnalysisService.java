package student_vadims_vladisevs.lesson_14.level_6;

import java.util.*;
import java.util.stream.Collectors;


class TransactionAnalysisService {

    private List<Transaction> descendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    private List<Transaction> ascendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public Optional<Integer> theBiggestValueV1(List<Transaction> transactions){
        List<Transaction> descendingListByValue = descendingSortByValue(transactions);
        return Optional.of(descendingListByValue.get(0).getValue());
    }

    public OptionalInt theBiggestValueV2(List<Transaction> transactions){
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max();
    }

    public Optional<Integer> theSmallestValueV1(List<Transaction> transactions){
        List<Transaction> ascendingListByValue = ascendingSortByValue(transactions);
        return Optional.of(ascendingListByValue.get(0).getValue());
    }

    public OptionalInt theSmallestValueV2(List<Transaction> transactions){
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min();
    }

    public String tradersNameAlphabet(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

    public String tradersCitiesAlphabet(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

}
