package student_aleksey_kodin.code_review_analyzer.logic;

import teacher.codereview.CodeReviewStudentAnswer;
import java.util.ArrayList;
import java.util.List;

public class StudentCodeReviewAnalysis implements CodeReviewAnalyzer {
    private int codeReviewAnswers = 0;
    private final List<String> classesCodeReviewAnswers = new ArrayList<>();

    @Override
    public Report getAnalysis(List<String> classesPath, String scannedPackage, Report report) throws ClassNotFoundException {

        report.addStringToReport("Student answers analysis for package " + scannedPackage + "\n");

        for (String classInPackage : classesPath) {
            Class<?> classForAnalysis = Class.forName(classInPackage);
            CodeReviewStudentAnswer annotation = classForAnalysis.getAnnotation(CodeReviewStudentAnswer.class);
            if (isNoAnnotation(annotation)) {
                continue;
            }
            if (isCodeReviewTrue(annotation)) {
                classesCodeReviewAnswers.add(classInPackage);
                codeReviewAnswers++;
            }
        }

        report.addStringToReport("Student make answers: " + codeReviewAnswers + "\n");
        report.addStudentAnswersCodeReview(classesCodeReviewAnswers);

        return report;
    }

    private boolean isNoAnnotation(CodeReviewStudentAnswer annotation) {
        return annotation == null;
    }

    private boolean isCodeReviewTrue(CodeReviewStudentAnswer annotation) {
        return annotation.approved();
    }

    public int getCodeReviewAnswers() {
        return codeReviewAnswers;
    }
}
