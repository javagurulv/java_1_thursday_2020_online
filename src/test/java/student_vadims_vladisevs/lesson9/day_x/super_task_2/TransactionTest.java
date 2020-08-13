package student_vadims_vladisevs.lesson9.day_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void transactionsBuilderTest_v1() {
        Trader trader = Trader.newBuilder()
                .setFullName("Vadim")
                .setCity("Riga")
                .setCountry("Latvia")
                .build();

        Transaction transaction = Transaction.newBuilder()
                .addTrader(trader)
                .addAmount(1000)
                .build();

        assertEquals(1000, transaction.getAmount());
        assertEquals("Vadim", transaction.getTrader().getFullName());
        assertEquals("Riga", transaction.getTrader().getCity());
        assertEquals("Latvia", transaction.getTrader().getCountry());
    }

    @Test
    public void transactionsBuilderTest_v2() {
        Trader trader = Trader.newBuilder()
                .setFullName("Vadim")
                .setCity("Riga")
                .setCountry("Latvia")
                .build();

        Transaction transaction = Transaction.newBuilder()
                .addTrader(trader)
                .build();

        assertEquals(0,transaction.getAmount());
        assertEquals("Vadim", transaction.getTrader().getFullName());
        assertEquals("Riga", transaction.getTrader().getCity());
        assertEquals("Latvia", transaction.getTrader().getCountry());
    }

    @Test
    public void transactionsBuilderTest_v3() {

        Transaction transaction = Transaction.newBuilder()
                .addAmount(1000)
                .build();

        assertEquals(1000,transaction.getAmount());
    }


}