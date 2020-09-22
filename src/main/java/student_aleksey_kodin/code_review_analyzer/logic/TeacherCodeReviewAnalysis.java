package student_aleksey_kodin.code_review_analyzer.logic;

import teacher.codereview.CodeReview;
import java.util.ArrayList;
import java.util.List;

public class TeacherCodeReviewAnalysis implements CodeReviewAnalyzer {
    private int classesCount = 0;
    private int codeReviewPassed = 0;
    private int codeReviewFailed = 0;
    private final List<String> failedCodeReview = new ArrayList<>();

    @Override
    public Report getAnalysis(List<String> classesPath, String scannedPackage,Report report) throws ClassNotFoundException {

        report.addStringToReport("Analysis for package " + scannedPackage + "\n");

        for (String classInPackage : classesPath) {
            Class<?> classForAnalysis = Class.forName(classInPackage);
            CodeReview annotation = classForAnalysis.getAnnotation(CodeReview.class);
            if (isNoAnnotation(annotation)) {
                continue;
            }
            if (isCodeReviewTrue(annotation)) {
                codeReviewPassed++;
            } else {
                failedCodeReview.add(classInPackage);
                codeReviewFailed++;
            }
            classesCount++;
        }

        report.addStringToReport("Total classes with Annotation: " + classesCount + "\n");
        report.addStringToReport("Code Review Passed: " + codeReviewPassed + "\n");
        report.addStringToReport("Code Review Failed: " + codeReviewFailed + "\n");
        report.addFailedCodeReview(failedCodeReview);

        return report;
    }

    public int getClassesCount() {
        return classesCount;
    }

    public int getCodeReviewPassed() {
        return codeReviewPassed;
    }

    public int getCodeReviewFailed() {
        return codeReviewFailed;
    }

    private boolean isNoAnnotation(CodeReview annotation) {
        return annotation == null;
    }

    private boolean isCodeReviewTrue(CodeReview annotation) {
        return annotation.approved();
    }
}