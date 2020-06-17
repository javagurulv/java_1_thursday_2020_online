package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic;

import org.junit.Test;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/*
Risk type - FLOOD
 */

public class InsurancePolicyPremiumCalculatorTest {
    InsurancePolicyPremiumCalculator testCalc = new InsurancePolicyPremiumCalculator();

    @Test
    public void calculateHouseFloodRisk() {
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("100"));
        house.addInsuranceRisk(InsuranceRisk.FLOOD);
        tv.addInsuranceRisk(InsuranceRisk.FLOOD);
        house.addSubInsuranceObject(tv);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("404.00"), actual);
    }

    @Test
    public void calculateHouseFloodRiskV2() {
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("3500"));
        house.addInsuranceRisk(InsuranceRisk.FLOOD);
        tv.addInsuranceRisk(InsuranceRisk.FLOOD);
        house.addSubInsuranceObject(tv);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("610.00"), actual);
    }

    @Test
    public void calculateFlatFloodRisk() {
        Policy policy = new Policy();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("100"));
        flat.addInsuranceRisk(InsuranceRisk.FLOOD);
        tv.addInsuranceRisk(InsuranceRisk.FLOOD);
        flat.addSubInsuranceObject(tv);
        policy.addInsuranceObject(flat);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("304.00"), actual);
    }

    @Test
    public void calculateFlatFloodRiskV2() {
        Policy policy = new Policy();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("3500"));
        flat.addInsuranceRisk(InsuranceRisk.FLOOD);
        tv.addInsuranceRisk(InsuranceRisk.FLOOD);
        flat.addSubInsuranceObject(tv);
        policy.addInsuranceObject(flat);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("510.00"), actual);
    }


}