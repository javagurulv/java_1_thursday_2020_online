package student_aleksey_kodin.lesson15.level_6;

import java.util.concurrent.atomic.AtomicReference;

class RegularCategory {
    double calculateRegularCategory(Customer customer) {
        AtomicReference<Double> thisAmount = new AtomicReference<>((double) 0);

        customer.rentals.stream().filter(reg -> reg.getMovie().getPriceCode() == MovieCategory.REGULAR).forEach(reg ->
        {
            thisAmount.updateAndGet(v -> v + 2);
            if (reg.getDaysRented() > 2) {
                thisAmount.updateAndGet(v -> v + ((reg.getDaysRented() - 2) * 1.5));
            }
            customer.setFrequentRenterPoints(customer.getFrequentRenterPoints() + 1);
        });
        return thisAmount.get();
    }
}
