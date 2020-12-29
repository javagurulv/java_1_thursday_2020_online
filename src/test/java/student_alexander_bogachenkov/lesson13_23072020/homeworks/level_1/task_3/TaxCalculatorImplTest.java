package student_alexander_bogachenkov.lesson13_23072020.homeworks.level_1.task_3;

import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Ignore
public class TaxCalculatorImplTest {

    @Test
    public void shouldCalculateTax_whenIncomeIs0() {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal("0"));
        BigDecimal expected = new BigDecimal("0.00");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTax_whenIncomeIs20000() {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal("20000"));
        BigDecimal expected = new BigDecimal("5000.00");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTax_whenIncomeIs10000() {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal("10000"));
        BigDecimal expected = new BigDecimal("2500.00");
        assertEquals(expected, actual);
    }
}