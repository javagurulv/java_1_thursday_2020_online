package student_aleksey_kodin.lesson15.level_6;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.logic.*;
import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.List;

@CodeReview(approved = true)
class RentCalculatorImpl implements RentCalculator {
    private final List<CalculateCategories> calculateCategories;
    private final Report report;

    RentCalculatorImpl(Report report) {
        this.report = report;
        calculateCategories = createCategories(new RegularCategory(), new NewReleaseCategory(),
                new ChildrenCategory());
    }

    @Override
    public Customer calculate(Customer customer) {

        report.addStringToReport("Rental Record for " + customer.getName() + "\n");

        calculationAmount(customer);

        int frequentRenterPoints = calculationFrequentRenterPointsNewReleaseCategory(customer);

        customer.setFrequentRenterPoints(frequentRenterPoints);

        report.addStringToReport("You owed " + customer.getTotalAmount() + "\n");

        report.addStringToReport("You earned " + frequentRenterPoints + " frequent renter points\n");

        return customer;
    }

    private List<CalculateCategories> createCategories(CalculateCategories... classes) {
        return Arrays.asList(classes);
    }

    private void calculationAmount(Customer customer) {
        double thisAmount = calculateCategories.stream().map(calc -> calc.calculateCategory(customer, report))
                .reduce(Double::sum).orElse(0.00);

        customer.setTotalAmount(customer.getTotalAmount() + thisAmount);
    }

    private int calculationFrequentRenterPointsNewReleaseCategory(Customer customer) {
        int frequentRenterPoints = customer.getFrequentRenterPoints();

        frequentRenterPoints += calculateCategories.stream()
                .filter(cl -> cl.getClass().getSimpleName().equals("NewReleaseCategory"))
                .mapToInt(p -> p.calculateFrequentRenterPoints(customer)).sum();

        return frequentRenterPoints;
    }
}
