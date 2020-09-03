package student_aleksey_kodin.lesson15.level_6.domain;

// This file is the original program.  It has been left here so you can compare it with the refactored version.

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private double totalAmount = 0;
    private int frequentRenterPoints = 0;
    public List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setFrequentRenterPoints(int frequentRenterPoints) {
        this.frequentRenterPoints = frequentRenterPoints;
    }
}