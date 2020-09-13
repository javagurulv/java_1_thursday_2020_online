package student_igors_mihejevs.lesson_11.homework.level_4;

import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UniqueWordFinderDemo {

    public static void main(String[] args) {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> setOfFoundWords = uniqueWordFinder.find("Guitar is instrument and Piano is instrument");
        for (String foundWords : setOfFoundWords) {
            System.out.println(foundWords);
        }
    }

}
