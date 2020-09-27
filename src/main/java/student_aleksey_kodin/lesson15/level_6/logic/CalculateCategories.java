package student_aleksey_kodin.lesson15.level_6.logic;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.domain.MovieCategory;
import teacher.codereview.CodeReview;
import java.util.concurrent.atomic.AtomicReference;

@CodeReview(approved = true)
public interface CalculateCategories {
    double calculateCategory(Customer customer, Report report);

    default void addStringToReport(Report report, String newString) {
        report.addStringToReport(newString);
    }

    default int calculateFrequentRenterPoints(Customer customer) {
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
