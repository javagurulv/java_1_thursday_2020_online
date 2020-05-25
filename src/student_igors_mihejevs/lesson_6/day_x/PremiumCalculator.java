package student_igors_mihejevs.lesson_6.day_x;

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
            // System.out.println(policyObject);
            finalPrice += calc.calculate(policyObject);
            // System.out.println(policyObject);
            // System.out.println(finalPrice);
            System.out.print("Please input key 1 to continue, else input any other key : ");
            myInput = clientInput.nextInt();
        }
        System.out.println("-----------------------------------------");
        System.out.println("The final cost of insurance is : " + finalPrice);
    }

    double calculate(Policy policy) {

        double currentPrice = 0;
        if (policy.getNameOfObject().equals("House")) {
            currentPrice = policy.getPriceOfObject() * 0.05;
        }
        if (policy.getNameOfObject().equals("Apartment")) {
            currentPrice = policy.getPriceOfObject() * 0.02;
        }
        if (!policy.getNameOfObject().equals("House") && !policy.getNameOfObject().equals("Apartment")) {
            if (policy.getPriceOfObject() <= 2000) {
                if (policy.isFire()) {
                    currentPrice = policy.getPriceOfObject() * 0.03;
                } else currentPrice = policy.getPriceOfObject() * 0.01;
            } else if (policy.isFire()) {
                currentPrice = policy.getPriceOfObject() * 0.04;
            } else {
                currentPrice = policy.getPriceOfObject() * 0.02;
            }
        }
        // System.out.println(policy);
        return currentPrice;
    }
/*
    private Policy policyObjectInput() {
        Scanner clientInput = new Scanner(System.in);
        Policy policyObject = new Policy();

        int firstInput;
        do {
            System.out.print("Please input insurance object number.\n1 - House\n2 - Apartment\n3 - Movable Property\n-> ");
            firstInput = clientInput.nextInt();
        } while ((firstInput < 1) || (firstInput > 3));
        switch (firstInput) {
            case 1 -> {
                policyObject.setNameOfObject("House");
                policyObject.setMovableProperty(false);
                policyObject.setFire(true);
            }
            case 2 -> {
                policyObject.setNameOfObject("Apartment");
                policyObject.setMovableProperty(false);
                policyObject.setFire(true);
            }
            case 3 -> {
                policyObject.setNameOfObject("Movable Property");
                policyObject.setMovableProperty(true);
                System.out.print("Please input type of movable property insurance.\n1 - Fire insurance\n2 - Theft insurance\n-> ");
                firstInput = clientInput.nextInt();
                if (firstInput == 1) {
                    policyObject.setFire(true);
                }
            }
        }
        System.out.print("Please input insurance object sum : ");
        policyObject.setPriceOfObject(clientInput.nextInt());
        // System.out.println(policyObject);
        return policyObject;
    }
*/
}
