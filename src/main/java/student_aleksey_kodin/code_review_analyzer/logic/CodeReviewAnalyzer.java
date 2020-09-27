package student_aleksey_kodin.code_review_analyzer.logic;

import java.util.List;

public interface CodeReviewAnalyzer {

    Report getAnalysis(List<String > classesPath, String scannedPackage, Report report) throws ClassNotFoundException;
}
