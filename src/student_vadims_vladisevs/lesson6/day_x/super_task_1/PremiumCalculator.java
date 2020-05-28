package student_vadims_vladisevs.lesson6.day_x.super_task_1;

class PremiumCalculator {
    public static void main(String[] args) {

        PremiumCalculator calculator = new PremiumCalculator();
        Policy policy = new Policy();
        policy.createClient("Vadim");
        policy.addPropertyHouse("Riga", 100000);
        policy.addElectronic("Television", 1200);
        policy.addElectronic("Kettle", 20);

        policy.printInfo("Vadim");
        System.out.println("----------");
       double policyValue = calculator.calculate(policy);
        System.out.println("Policy value = " + policyValue);



    }

    public double calculate(Policy policy){
        double finalValue = 0.0;
        finalValue += policy.isFireElectronic();
        finalValue += policy.isTheftElectronics();

        for (Property tempProperty : policy.propertyList){
            finalValue += policy.isFireProperty(tempProperty);
        }

        return finalValue;
    }


}
