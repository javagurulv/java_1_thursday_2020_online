package student_aleksey_kodin.lesson15.level_6;

import java.util.concurrent.atomic.AtomicReference;

class ChildrenCategory {
    double calculateChildrenCategory(Customer customer) {
        AtomicReference<Double> thisAmount = new AtomicReference<>((double) 0);

        customer.rentals.stream().filter(reg -> reg.getMovie().getPriceCode() == MovieCategory.CHILDREN).forEach(reg ->
        {
            thisAmount.updateAndGet(v -> v + 1.5);
            if (reg.getDaysRented() > 3) {
                thisAmount.updateAndGet(v -> v + ((reg.getDaysRented() - 3) * 1.5));
            }
            customer.setFrequentRenterPoints(customer.getFrequentRenterPoints() + 1);
        });

        return thisAmount.get();
    }
}
