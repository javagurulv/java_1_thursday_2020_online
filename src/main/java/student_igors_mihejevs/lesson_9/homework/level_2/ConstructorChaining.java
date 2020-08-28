package student_igors_mihejevs.lesson_9.homework.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }

}
