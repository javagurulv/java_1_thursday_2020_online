package student_aleksey_kodin.code_review_analyzer;

import student_aleksey_kodin.code_review_analyzer.logic.ClassFinder;
import student_aleksey_kodin.code_review_analyzer.logic.Report;
import student_aleksey_kodin.code_review_analyzer.logic.StudentCodeReviewAnalysis;
import student_aleksey_kodin.code_review_analyzer.logic.TeacherCodeReviewAnalysis;

import java.io.IOException;
import java.util.List;

public class CodeReviewImpl implements CodeReview {
    @Override
    public Report codeReview(String scannedPackage) throws IOException, ClassNotFoundException {
        final String BAD_PACKAGE_ERROR = "Unable to get resources from path " + scannedPackage +
                "." + "\nAre you sure the package " + scannedPackage + " exists?" + "\n";

        ClassFinder classFinder = new ClassFinder();
        Report report = new Report();
        List<String> classesForAnalyzer;

        TeacherCodeReviewAnalysis teacherCodeReviewAnalysis = new TeacherCodeReviewAnalysis();
        StudentCodeReviewAnalysis studentCodeReviewAnalysis = new StudentCodeReviewAnalysis();

        classesForAnalyzer = classFinder.findAllClassesInPackage(scannedPackage);

        if (classFinder.isFilePathCorrect()) {
            report = teacherCodeReviewAnalysis.getAnalysis(classesForAnalyzer, scannedPackage, report);
            return studentCodeReviewAnalysis.getAnalysis(classesForAnalyzer, scannedPackage, report);
        }
        return new Report(BAD_PACKAGE_ERROR);
    }
}