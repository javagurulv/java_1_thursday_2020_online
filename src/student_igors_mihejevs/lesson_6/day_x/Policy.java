package student_igors_mihejevs.lesson_6.day_x;

import java.util.Scanner;

class Policy {

    private String nameOfObject;
    private double priceOfObject;
    private boolean isMovableProperty;
    private boolean isFire;

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




    public void setNameOfObject(String nameOfObject) {
        this.nameOfObject = nameOfObject;
    }

    public void setPriceOfObject(double priceOfObject) {
        this.priceOfObject = priceOfObject;
    }

    public void setMovableProperty(boolean movableProperty) {
        isMovableProperty = movableProperty;
    }

    public void setFire(boolean fire) {
        isFire = fire;
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