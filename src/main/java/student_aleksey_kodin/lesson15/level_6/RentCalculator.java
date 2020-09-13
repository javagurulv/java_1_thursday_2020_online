package student_aleksey_kodin.lesson15.level_6;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface RentCalculator {
    Customer calculate(Customer customer);
}
