package student_vadims_vladisevs.lesson_14.level_3;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class TransactionAnalysisService {

    public List<Transaction> findTransactionByYear(List<Transaction> transactions, int year){
        return transactions.stream().filter(temp -> temp.getYear() == year).collect(Collectors.toList());
    }

    public List<Transaction> ascendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public List<Transaction> descendingSortByValue(List<Transaction> transactions){
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    public List<Transaction> findAscendingTransactionByYear(List<Transaction> transactions, int year){
        List<Transaction> tempList = findTransactionByYear(transactions, year);
        return ascendingSortByValue(tempList);
    }

}
