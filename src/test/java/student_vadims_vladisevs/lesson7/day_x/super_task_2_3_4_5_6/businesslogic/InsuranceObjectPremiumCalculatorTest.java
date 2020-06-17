package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic;

import org.junit.Test;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class InsuranceObjectPremiumCalculatorTest {

    @Test
    public void calculateTestHouseFireRisk() {
        InsuranceObjectPremiumCalculator testCalc = new InsuranceObjectPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000"));
        house.addInsuranceRisk(InsuranceRisk.FIRE);
        BigDecimal actual = testCalc.calculate(house);
        assertEquals(new BigDecimal("5000.00"), actual);
    }

    @Test
    public void calculateTestFlatFireRisk() {
        InsuranceObjectPremiumCalculator testCalc = new InsuranceObjectPremiumCalculator();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("100000"));
        flat.addInsuranceRisk(InsuranceRisk.FIRE);
        BigDecimal actual = testCalc.calculate(flat);
        assertEquals(new BigDecimal("2000.00"), actual);
    }

    @Test
    public void calculateTestHouseTheftRisk() {
        InsuranceObjectPremiumCalculator testCalc = new InsuranceObjectPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000"));
        house.addInsuranceRisk(InsuranceRisk.THEFT);
        BigDecimal actual = testCalc.calculate(house);
        assertEquals(new BigDecimal("2000.00"), actual);
    }

    @Test
    public void calculateTestFlatTheftRisk() {
        InsuranceObjectPremiumCalculator testCalc = new InsuranceObjectPremiumCalculator();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("100000"));
        flat.addInsuranceRisk(InsuranceRisk.THEFT);
        BigDecimal actual = testCalc.calculate(flat);
        assertEquals(new BigDecimal("1000.00"), actual);
    }
}