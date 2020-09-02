package student_aleksey_kodin.lesson15.level_6;

import java.util.concurrent.atomic.AtomicReference;

class NewReleaseCategory {
    double calculateNewReleaseCategory(Customer customer) {
        AtomicReference<Double> thisAmount = new AtomicReference<>((double) 0);

        customer.rentals.stream().filter(reg -> reg.getMovie().getPriceCode() == MovieCategory.NEW_RELEASE).forEach(reg -> {
            thisAmount.updateAndGet(v -> v + ((reg.getDaysRented() * 3)));
            customer.setFrequentRenterPoints(customer.getFrequentRenterPoints() + 1);
        });
        return thisAmount.get();
    }

    int calculateFrequentRenterPoints(Customer customer) {
        AtomicReference<Integer> pointsAmount = new AtomicReference<>(0);

        customer.rentals.stream().filter(reg -> reg.getMovie().getPriceCode() == MovieCategory.NEW_RELEASE).forEach(reg ->
        {
            if (reg.getDaysRented() > 1) {
                pointsAmount.updateAndGet(v -> v + 1);
            }
        });
        return pointsAmount.get();
    }
}
