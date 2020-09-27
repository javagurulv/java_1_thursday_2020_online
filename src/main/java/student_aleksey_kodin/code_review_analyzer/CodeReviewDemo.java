package student_aleksey_kodin.code_review_analyzer;

import student_aleksey_kodin.code_review_analyzer.logic.Report;

import java.io.IOException;


public class CodeReviewDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CodeReviewImpl codeReview = new CodeReviewImpl();

        Report report = codeReview.codeReview("student_aleksey_kodin.lesson16");

        report.showReport();

        Report report1 = codeReview.codeReview("student_aleksey_kodin.lesson15");

        report1.showReport();

        Report report2 = codeReview.codeReview("student_igors_mihejevs.lesson_11.homework");

        report2.showReport();

        Report report3 = codeReview.codeReview("student_igors_mihejevs.lesson_10.homework");

        report3.showReport();

        Report report4 = codeReview.codeReview("student_aleksey_kodin.lesson2");

        report4.showReport();

        Report report5 = codeReview.codeReview("student_aleksey_kodin.lesson20");

        report5.showReport();

        Report report6 = codeReview.codeReview("student_igors_mihejevs.lesson_11");

        report6.showReport();
    }
}
