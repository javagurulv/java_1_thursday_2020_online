package student_vadims_vladisevs.lesson_14.level_4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class TransactionAnalysisService {

    public List<Integer> findTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findUniqueTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersNames(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersCities(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersFromCambridge(List<Transaction> transactions){
       return  transactions.stream().
               map(Transaction::getTrader)
               .filter(tr -> tr.getCity().equals("Cambridge"))
               .map(Trader::getName)
               .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersByCity(List<Transaction> transactions, String city){
        return  transactions.stream().
                map(Transaction::getTrader)
                .filter(tr -> tr.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }
}
