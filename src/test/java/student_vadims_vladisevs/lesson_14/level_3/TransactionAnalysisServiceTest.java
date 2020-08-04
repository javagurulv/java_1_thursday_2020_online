package student_vadims_vladisevs.lesson_14.level_3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    List<Transaction> allTransactions = transactionTestData.getTransactions();

    @Test
    public void findTransactionByYear_2011() {
        List<Transaction> actual = transactionAnalysisService.findTransactionByYear(allTransactions, 2011);
        assertEquals(2, actual.size());
    }

    @Test
    public void findTransactionByYear_2012() {
        List<Transaction> actual = transactionAnalysisService.findTransactionByYear(allTransactions, 2012);
        assertEquals(4, actual.size());
    }

    @Test
    public void findTransactionByYear_2013() {
        List<Transaction> actual = transactionAnalysisService.findTransactionByYear(allTransactions, 2013);
        assertEquals(0, actual.size());
    }

    @Test
    public void ascendingSortByValue_v1(){
        List<Transaction> actual = transactionAnalysisService.ascendingSortByValue(allTransactions);
        assertEquals(300, actual.get(0).getValue());
    }

    @Test
    public void ascendingSortByValue_v2(){
        List<Transaction> actual = transactionAnalysisService.ascendingSortByValue(allTransactions);
        assertEquals(1000, actual.get(5).getValue());
    }

    @Test
    public void descendingSortByValue_v1(){
        List<Transaction> actual = transactionAnalysisService.descendingSortByValue(allTransactions);
        assertEquals(300, actual.get(5).getValue());
    }

    @Test
    public void descendingSortByValue_v2(){
        List<Transaction> actual = transactionAnalysisService.descendingSortByValue(allTransactions);
        assertEquals(1000, actual.get(0).getValue());
    }

    @Test
    public void findAscendingTransactionByYear_v1(){
        List<Transaction> actual = transactionAnalysisService.findAscendingTransactionByYear(allTransactions,2011);
        assertEquals(300, actual.get(0).getValue());
        assertEquals(400, actual.get(1).getValue());
        assertEquals(2, actual.size());
    }

    @Test
    public void findAscendingTransactionByYear_v2(){
        List<Transaction> actual = transactionAnalysisService.findAscendingTransactionByYear(allTransactions,2012);
        assertEquals(700, actual.get(0).getValue());
        assertEquals(1000, actual.get(3).getValue());
        assertEquals(4, actual.size());
    }

}