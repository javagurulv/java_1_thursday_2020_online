package student_aleksey_kodin.lesson15.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TennisGame {

    void wonPoint(String playerName);

    String score();
}
