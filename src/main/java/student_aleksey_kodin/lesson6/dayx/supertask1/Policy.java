package student_aleksey_kodin.lesson6.dayx.supertask1;

import java.util.Arrays;

class Policy {
    private final int EMPTY_ARRAY = 0;
    private double price;
    private String name;
    private double sumItemFire;  // а надо ли хранить это значение если его можно посчитать?
    private double sumItemTheft; // а надо ли хранить это значение если его можно посчитать?
    private Policy[] arrayPolicy = new Policy[EMPTY_ARRAY];
    private int arrayCount = EMPTY_ARRAY;
    Policy() {
    }
    Policy(String name,double price) {
        this.name = name;
        this.price = price;
    }
    public void addHouseOrFlat (String name,double price, boolean isHouse) {
        arrayCount++;
        arrayPolicy = Arrays.copyOf(arrayPolicy,arrayCount);
        if (isHouse) {
            price = (double) Math.round((0.05 * price) * 100) / 100;
        } else {
            price = (double) Math.round((0.02 * price) * 100) / 100;
        }
        this.price = price;
        arrayPolicy[arrayCount - 1] = new Policy(name,price);
    }
    public void addSubItem(String name,double price, boolean isFire) {
        if (isFire) {
            arrayCount++;
            arrayPolicy = Arrays.copyOf(arrayPolicy,arrayCount);
            sumItemFire += price;
            if (sumItemFire > 2000) {
                price = (double) Math.round((0.04 * price) * 100) / 100;
            } else {
                price = (double) Math.round((0.03 * price) * 100) / 100;
            }
            this.price = price;
            arrayPolicy[arrayCount - 1] = new Policy(name,price);
        } else {
            arrayCount++;
            arrayPolicy = Arrays.copyOf(arrayPolicy,arrayCount);
            sumItemTheft += price;
            if (sumItemTheft > 2000) {
                price = (double) Math.round((0.01 * price) * 100) / 100;
            } else {
                price = (double) Math.round((0.02 * price) * 100) / 100;
            }
            this.price = price;
            arrayPolicy[arrayCount - 1] = new Policy(name,price);
        }
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getArrayRecordsCount() {
        return arrayCount;
    }
    public double calculate() {
        double total = 0;
        for (Policy policyElement: arrayPolicy) {
            total += policyElement.getPrice();
        }
        return total;
    }
}
