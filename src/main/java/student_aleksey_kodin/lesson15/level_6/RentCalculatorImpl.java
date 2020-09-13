package student_aleksey_kodin.lesson15.level_6;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.logic.*;
import teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
class RentCalculatorImpl implements RentCalculator {
    private final Report report;

    RentCalculatorImpl(Report report) {
        this.report = report;
    }

    @Override
    public Customer calculate(Customer customer) {
        RegularCategory regularCategory = new RegularCategory();
        NewReleaseCategory newReleaseCategory = new NewReleaseCategory();
        ChildrenCategory childrenCategory = new ChildrenCategory();

        List<CalculateCategories> calculateCategories = new ArrayList<>();
        calculateCategories.add(regularCategory);
        calculateCategories.add(newReleaseCategory);
        calculateCategories.add(childrenCategory);

        report.addStringToReport("Rental Record for " + customer.getName() + "\n");

        double thisAmount = 0;
        for (CalculateCategories calc : calculateCategories) {

            thisAmount = thisAmount + calc.calculateCategory(customer, report);

        }

        customer.setTotalAmount(customer.getTotalAmount() + thisAmount);

        int frequentRenterPoints = customer.getFrequentRenterPoints();

        frequentRenterPoints = frequentRenterPoints + newReleaseCategory.calculateFrequentRenterPoints(customer);

        customer.setFrequentRenterPoints(frequentRenterPoints);

        report.addStringToReport("You owed " + customer.getTotalAmount() + "\n");

        report.addStringToReport("You earned " + frequentRenterPoints + " frequent renter points\n");

        return customer;
    }
}
