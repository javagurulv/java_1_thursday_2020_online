package student_aleksey_kodin.code_review_analyzer.logic;

import java.util.List;

public class Report {
    private String report = "";

    public Report() {
    }

    public Report(String errorMessage) {
        report = errorMessage;
    }

    public void addStringToReport(String newString) {
        report += newString;
    }

    public void showReport() {
        System.out.println(report);
    }

    public void addFailedCodeReview(List<String> failedCodeReview) {
        failedCodeReview.forEach(failed -> report += failed + "\n");
    }

    public void addStudentAnswersCodeReview(List<String> classesCodeReviewAnswers) {
        classesCodeReviewAnswers.forEach(answers -> report += answers + "\n");
    }
}
