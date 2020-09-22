package student_aleksey_kodin.code_review_analyzer;

import student_aleksey_kodin.code_review_analyzer.logic.Report;

import java.io.IOException;

public interface CodeReview {
    Report codeReview(String scannedPackage) throws IOException, ClassNotFoundException;
}
