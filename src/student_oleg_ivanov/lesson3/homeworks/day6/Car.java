package student_oleg_ivanov.lesson3.homeworks.day6;

class Car {
    private String model;
    private boolean isNew;
    private int price;
    private boolean priceCorrect;

    public Car(String model, boolean isNew, int price, boolean priceCorrect) {
        this.model = model;
        this.isNew = isNew;
        this.price = price;
        this.priceCorrect = priceCorrect;
    }

    public void aboutCar() {
        System.out.println("This car is: " + model);
        System.out.println(model + " is a new car: " + isNew);
        System.out.println("Car price is " + price + " Euro: " + priceCorrect);
    }

    public void aboutOldCar() {isNew = false; priceCorrect = false;}


}
