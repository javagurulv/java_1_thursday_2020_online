package student_aleksey_kodin.lesson15.level_6.logic;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.domain.MovieCategory;
import teacher.codereview.CodeReview;

import java.util.concurrent.atomic.AtomicReference;

@CodeReview(approved = true)
public class RegularCategory implements CalculateCategories {
    @Override
    public double calculateCategory(Customer customer, Report report) {
        AtomicReference<Double> thisAmount = new AtomicReference<>((double) 0);

        customer.rentals.stream().filter(reg -> reg.getMovie().getPriceCode() == MovieCategory.REGULAR).forEach(reg ->
        {
            thisAmount.updateAndGet(v -> v + 2);
            if (reg.getDaysRented() > 2) {
                thisAmount.updateAndGet(v -> v + ((reg.getDaysRented() - 2) * 1.5));
            }
            customer.setFrequentRenterPoints(customer.getFrequentRenterPoints() + 1);

            addStringToReport(report, "\t" + reg.getMovie().getTitle() + "\t" +
                    thisAmount.get() + "\n");
        });
        return thisAmount.get();
    }
}
