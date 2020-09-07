package student_aleksey_kodin.lesson15.level_6.logic;

import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface CalculateCategories {
    double calculateCategory(Customer customer, Report report);

    default void addStringToReport(Report report, String newString) {
        report.addStringToReport(newString);
    }
}
