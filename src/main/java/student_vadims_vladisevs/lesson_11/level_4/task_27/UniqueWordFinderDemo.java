package student_vadims_vladisevs.lesson_11.level_4.task_27;

import java.util.Set;

class UniqueWordFinderDemo {
    public static void main(String[] args) {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "RanDom randOM woRd Word text text text TExt";
        Set<String> list = uniqueWordFinder.find(text);

        for(String word : list){
            System.out.println(word);
        }
    }
}
