package student_igors_mihejevs.lesson_6.homework.level_x.my_variant;

import java.util.Scanner;

class PremiumCalculator {

    public static void main(String[] args) {
        double finalPrice = 0;
        int myInput;

        PremiumCalculator calc = new PremiumCalculator();
        Policy policyObject = new Policy();
        Scanner clientInput = new Scanner(System.in);

        System.out.print("Please input key 1 to continue, else input any other key : ");
        myInput = clientInput.nextInt();
        while (myInput == 1) {

            policyObject = policyObject.policyObjectInput();
            finalPrice += calc.calculate(policyObject);
            // System.out.println(policyObject);

            System.out.print("Please input key 1 to continue, else input any other key : ");
            myInput = clientInput.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("The final cost of insurance is : " + finalPrice);
    }

    double calculate(Policy policy) {

        double currentPrice = 0;
        double movPropSumFire = 0;
        double movPropSumTheft = 0;
        double movPropPriceFire, movPropPriceTheft;

        if (policy.getNameOfObject().equals("House")) {
            currentPrice = policy.getPriceOfObject() * 0.05;
        }
        if (policy.getNameOfObject().equals("Apartment")) {
            currentPrice = policy.getPriceOfObject() * 0.02;
        }
        if (!policy.getNameOfObject().equals("House") && !policy.getNameOfObject().equals("Apartment")) {
            if (policy.isFire()) movPropSumFire += policy.getPriceOfObject();
            else movPropSumTheft += policy.getPriceOfObject();
        }

        if (movPropSumFire <= 2000) movPropPriceFire = movPropSumFire * 0.03;
        else movPropPriceFire = movPropSumFire * 0.04;
        if (movPropSumTheft <= 2000) movPropPriceTheft = movPropSumTheft * 0.01;
        else movPropPriceTheft = movPropSumTheft * 0.02;

        // System.out.println(policy);
        return currentPrice + movPropPriceFire + movPropPriceTheft;
    }

}
