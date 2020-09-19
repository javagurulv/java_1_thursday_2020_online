package student_aleksey_kodin.lesson16.level_1_3.logic;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Directions -> Direction! This enum value represent one direction.")
@CodeReviewComment(student = "Directions represent all possible directions, but Direction - return current direction")
@CodeReviewComment(student = "for rover. What's wrong ? ")
public enum Directions {
    N,
    E,
    S,
    W
}
