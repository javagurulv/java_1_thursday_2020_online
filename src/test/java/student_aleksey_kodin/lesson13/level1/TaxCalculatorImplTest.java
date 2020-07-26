package student_aleksey_kodin.lesson13.level1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {

    private final TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayTaxAmountSetZero() {
        BigDecimal result = taxCalculator.calculateTax(new BigDecimal("0.00"));
        assertEquals(result,new BigDecimal("0.00"));
    }

    @Test
    public void shouldPayTaxAmountSet20000() {
        BigDecimal result = taxCalculator.calculateTax(new BigDecimal("20000.00"));
        assertEquals(result,new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPayTaxAmountSet10000() {
        BigDecimal result = taxCalculator.calculateTax(new BigDecimal("10000.00"));
        assertEquals(result,new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPayTaxAmountSet30000() {
        BigDecimal result = taxCalculator.calculateTax(new BigDecimal("30000.00"));
        assertEquals(result,new BigDecimal("9000.00"));
    }

    @Test
    public void shouldPayTaxAmountSet100000() {
        BigDecimal result = taxCalculator.calculateTax(new BigDecimal("100000.00"));
        assertEquals(result,new BigDecimal("37000.00"));
    }

}