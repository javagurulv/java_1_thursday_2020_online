package student_vadims_vladisevs.lesson_13.level_1;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();


    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
       var actual =  taxCalculator.calculateTax(BigDecimal.ZERO);
       var expected = new BigDecimal("0.00");
       assertEquals(expected, actual);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var actual =  taxCalculator.calculateTax(new BigDecimal("1000"));
        var expected = new BigDecimal("250.00");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var actual =  taxCalculator.calculateTax(new BigDecimal("20000"));
        var expected = new BigDecimal("5000.00");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var actual =  taxCalculator.calculateTax(new BigDecimal("30000"));
        var expected = new BigDecimal("9000.00");
        assertEquals(expected, actual);
    }
}