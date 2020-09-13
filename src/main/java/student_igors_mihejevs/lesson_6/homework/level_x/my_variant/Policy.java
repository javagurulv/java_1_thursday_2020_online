package student_igors_mihejevs.lesson_6.homework.level_x.my_variant;

import java.util.Scanner;

class Policy {

    private String nameOfObject;
    private double priceOfObject;
    private boolean isMovableProperty;
    private boolean isFire;
/*
    public Policy(String nameOfObject, double priceOfObject, boolean isMovableProperty, boolean isFire) {
        this.nameOfObject = nameOfObject;
        this.priceOfObject = priceOfObject;
        this.isMovableProperty = isMovableProperty;
        this.isFire = isFire;
    }
*/
    @Override
    public String toString() {
        return "Policy{" +
                "nameOfObject='" + nameOfObject + '\'' +
                ", priceOfObject=" + priceOfObject +
                ", isMovableProperty=" + isMovableProperty +
                ", isFire=" + isFire +
                '}';
    }

    Policy policyObjectInput() {
        Scanner clientInput = new Scanner(System.in);
        Policy policyObject = new Policy();

        int firstInput;
        do {
            System.out.print("Please input insurance object number.\n1 - House\n2 - Apartment\n3 - Movable Property\n-> ");
            firstInput = clientInput.nextInt();
        } while ((firstInput < 1) || (firstInput > 3));
        switch (firstInput) {
            case 1 -> {
                policyObject.nameOfObject = "House";
                policyObject.isMovableProperty = false;
                policyObject.isFire = true;
            }
            case 2 -> {
                policyObject.nameOfObject = "Apartment";
                policyObject.isMovableProperty = false;
                policyObject.isFire = true;
            }
            case 3 -> {
                policyObject.nameOfObject = "Movable Property";
                policyObject.isMovableProperty = true;
                do {
                    System.out.print("Please input type of movable property insurance.\n1 - Fire insurance\n2 - Theft insurance\n-> ");
                    firstInput = clientInput.nextInt();
                } while (firstInput != 1 && firstInput !=2);
                if (firstInput == 1) {
                    policyObject.isFire = true;
                }
            }
        }
        System.out.print("Please input insurance object sum : ");
        policyObject.priceOfObject = clientInput.nextInt();
        // System.out.println(policyObject);
        return policyObject;
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public double getPriceOfObject() {
        return priceOfObject;
    }

    public boolean isFire() {
        return isFire;
    }
}