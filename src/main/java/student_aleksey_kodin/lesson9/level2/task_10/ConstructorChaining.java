package student_aleksey_kodin.lesson9.level2.task_10;

class ConstructorChaining {
    private final String constructorName;
    private final int parameterCount;

    ConstructorChaining() {
        this(ConstructorChaining.class.getSimpleName());
    }

    private ConstructorChaining(String constructorName) {
        this(constructorName,1);

    }

     ConstructorChaining(String constructorName,int parameterCount) {
         this.constructorName = constructorName;
         this.parameterCount = parameterCount;
         System.out.println("Constructor name - " + constructorName);
         System.out.println("Parameter count - " + parameterCount);
     }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
