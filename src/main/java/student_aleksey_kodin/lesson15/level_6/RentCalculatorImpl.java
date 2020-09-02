package student_aleksey_kodin.lesson15.level_6;

class RentCalculatorImpl implements RentCalculator {
    @Override
    public Customer calculate(Customer customer) {
        RegularCategory regularCategory = new RegularCategory();
        NewReleaseCategory newReleaseCategory = new NewReleaseCategory();
        ChildrenCategory childrenCategory = new ChildrenCategory();

        double thisAmount = regularCategory.calculateRegularCategory(customer);

        thisAmount = thisAmount + newReleaseCategory.calculateNewReleaseCategory(customer);

        thisAmount = thisAmount + childrenCategory.calculateChildrenCategory(customer);

        customer.setTotalAmount(customer.getTotalAmount() + thisAmount);

        int frequentRenterPoints = customer.getFrequentRenterPoints();

        frequentRenterPoints = frequentRenterPoints + newReleaseCategory.calculateFrequentRenterPoints(customer);

        customer.setFrequentRenterPoints(frequentRenterPoints);

        return customer;
    }
}
