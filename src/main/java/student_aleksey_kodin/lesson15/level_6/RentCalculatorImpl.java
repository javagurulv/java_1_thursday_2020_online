package student_aleksey_kodin.lesson15.level_6;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.logic.*;
import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.List;

@CodeReview(approved = true)
class RentCalculatorImpl implements RentCalculator {
    private final RegularCategory regularCategory = new RegularCategory();
    private final NewReleaseCategory newReleaseCategory = new NewReleaseCategory();
    private final ChildrenCategory childrenCategory = new ChildrenCategory();
    private final Report report;

    RentCalculatorImpl(Report report) {
        this.report = report;
    }

    @Override
    public Customer calculate(Customer customer) {

        List<CalculateCategories> calculateCategories = createCategories(regularCategory, newReleaseCategory,
                childrenCategory);

        report.addStringToReport("Rental Record for " + customer.getName() + "\n");

        double thisAmount = calculateCategories.stream().map(calc -> calc.calculateCategory(customer, report))
                .reduce(Double::sum).orElse(0.00);

        customer.setTotalAmount(customer.getTotalAmount() + thisAmount);

        int frequentRenterPoints = customer.getFrequentRenterPoints();

        frequentRenterPoints += newReleaseCategory.calculateFrequentRenterPoints(customer);

        customer.setFrequentRenterPoints(frequentRenterPoints);

        report.addStringToReport("You owed " + customer.getTotalAmount() + "\n");

        report.addStringToReport("You earned " + frequentRenterPoints + " frequent renter points\n");

        return customer;
    }

    private List<CalculateCategories> createCategories(CalculateCategories... classes) {
        return Arrays.asList(classes);
    }
}
