package student_julija_skopeca.practical_tasks.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount){
        ConstructorChaining constructorChaining = new ConstructorChaining(constructorName);
        this.parameterCount= parameterCount;
    }

    // допишите решение тут

}
