package student_vadims_vladisevs.lesson9.day_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TraderTest {

    @Test
    public void builderTest_v1() {
        Trader trader = Trader.newBuilder()
                .setFullName("Vadim")
                .setCity("Riga")
                .setCountry("Latvia")
                .build();

        assertEquals("Vadim", trader.getFullName());
        assertEquals("Riga", trader.getCity());
        assertEquals("Latvia", trader.getCountry());
    }

    @Test
    public void builderTest_v2() {
        Trader trader = Trader.newBuilder()
                .setFullName("name")
                .setCity("city")
                .build();

        assertEquals("name", trader.getFullName());
        assertEquals("city", trader.getCity());
        assertNull(trader.getCountry());
    }

    @Test
    public void builderTest_v3() {
        Trader trader = Trader.newBuilder()
                .setFullName("name")
                .build();

        assertEquals("name", trader.getFullName());
        assertNull(trader.getCity());
        assertNull(trader.getCountry());
    }
}